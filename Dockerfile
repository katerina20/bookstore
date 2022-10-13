FROM openjdk:11
COPY target/bookstore-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java","-jar","/app.jar"]
HEALTHCHECK CMD curl http://localhost:8080/
