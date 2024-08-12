
FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/ejVeterinaria-0.0.1.jar
COPY ${JAR_FILE} ejVeterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ejVeterinaria.jar"]
