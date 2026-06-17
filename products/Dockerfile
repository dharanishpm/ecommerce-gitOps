FROM eclipse-temurin:21-jdk
LABEL authors="dharanish"
WORKDIR /app
COPY target/products-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar","app.jar"]