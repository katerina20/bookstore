FROM amazoncorretto:11-alpine-jdk

#ENV APP_HOME=D:\Projects\bookstore\target
#WORKDIR $APP_HOME
#COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","/app.jar"]


#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


#COPY target/bookstore-0.0.1-SNAPSHOT.war bookstore-0.0.1-SNAPSHOT.war
#ENTRYPOINT ["java", "-jar", "/bookstore-0.0.1-SNAPSHOT.war"]

#WORKDIR ../bookstore
#
#CMD ["pwd"]
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#
#COPY src ./src
#
#CMD ["./mvnw", "spring-boot:run"]



#WORKDIR /bookstore
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#
#COPY src ./src
#
#CMD ["./mvnw", "spring-boot:run"]