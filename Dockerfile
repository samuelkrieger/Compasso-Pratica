FROM openjdk:11-jdk
MAINTAINER Samuel Krieger
WORKDIR /app
EXPOSE 8080
COPY target/Compassotest-0.0.1-SNAPSHOT.jar/Compassotest.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
