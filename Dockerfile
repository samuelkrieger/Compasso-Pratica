FROM openjdk:latest

EXPOSE 8080

RUN mkdir /app

COPY build/libs/*.jar /app/Compassotest-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "/app/Compassotest-0.0.1-SNAPSHOT.jar"]
