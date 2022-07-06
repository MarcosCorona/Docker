FROM openjdk:17
EXPOSE 8081
COPY /target/postgres-docker-0.0.1-SNAPSHOT.jar /usr/local/lib/spring.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/spring.jar"]
