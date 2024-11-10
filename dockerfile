FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/LolApi-0.0.1-SNAPSHOT.jar /app/LolApiApplication.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/LolApiApplication.jar"]