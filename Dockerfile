FROM openjdk:17-alpine

COPY service/target/service-exec.jar service.jar

EXPOSE 8080

ENTRYPOINT java -jar service.jar