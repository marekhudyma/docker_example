FROM openjdk:17-alpine

COPY target/docker-java-fat-jar-tests-1.0.0-SNAPSHOT.jar service.jar

EXPOSE 8080

ENTRYPOINT java -jar service.jar
