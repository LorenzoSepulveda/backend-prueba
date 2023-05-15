FROM amazoncorretto:8-alpine-jdk
MAINTAINER NGA
COPY target/nga-0.0.1-SNAPSHOT.jar nga-app.jar
EXPOSE 808
ENTRYPOINT  ["java","-jar","nga-app.jar"]