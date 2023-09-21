FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . /app

VOLUME /app/data

CMD java -jar app.jar