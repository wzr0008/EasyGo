FROM openjdk:8-jdk-alpine
ARG jar_file
ADD ${jar_file} app.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","/app.jar"]