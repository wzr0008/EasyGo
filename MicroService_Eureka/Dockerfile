FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","/app.jar"]