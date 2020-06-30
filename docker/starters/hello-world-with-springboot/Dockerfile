FROM openjdk:8-jdk-alpine
ADD target/app.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]