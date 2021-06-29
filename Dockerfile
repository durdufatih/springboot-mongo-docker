FROM openjdk:11
MAINTAINER Fatih Durdu
WORKDIR /app

COPY ./target/mongodb-0.0.1-SNAPSHOT.jar ./app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]