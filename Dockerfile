FROM openjdk:11-jdk
MAINTAINER Samuel Krieger
WORKDIR /app
EXPOSE 8080
COPY target=Compasssotest.jar
ENTRYPOINT ["java", "-jar", "app.jar"]