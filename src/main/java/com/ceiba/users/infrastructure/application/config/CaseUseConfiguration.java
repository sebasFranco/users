package com.ceiba.users.infrastructure.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.users.domain.ports.UserRepository;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.db.PostgresqlUserRepository;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jparepository.JpaUserRepository;

@Configuration
public class CaseUseConfiguration {
	
	
    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return new PostgresqlUserRepository(jpaUserRepository);
    }
}
