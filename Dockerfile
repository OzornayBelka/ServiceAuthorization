FROM openjdk:18-oracle

EXPOSE 8080

COPY target/ServiceAuthorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
