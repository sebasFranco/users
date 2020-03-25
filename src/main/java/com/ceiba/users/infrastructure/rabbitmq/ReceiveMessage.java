package com.ceiba.users.infrastructure.rabbitmq;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.db.PostgresqlUserRepository;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;


public class ReceiveMessage {
	
	private final static String QUEUE_NAME = "movies";
	private final static Logger LOGGER = Logger.getLogger("bitacora.subnivel.Control");

	private PostgresqlUserRepository postgresqlUserRepository;
	
    public void receive() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        LOGGER.log(Level.INFO," [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            LOGGER.log(Level.INFO," [x] Received '" + message + "'");
            postgresqlUserRepository.updateAmountMoviesUser(Long.parseLong(message));
        };
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
    }
}
