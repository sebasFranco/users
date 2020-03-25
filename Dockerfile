FROM openjdk:13-jdk-alpine
VOLUME /tmp
EXPOSE 8083
ADD ./users/build/libs/users-0.0.1-SNAPSHOT.jar /app/users-service.jar
ENTRYPOINT ["java","-jar", "/app/users-service.jar"]