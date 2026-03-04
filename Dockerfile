FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Asume que compilas con "mvn clean package" desde la carpeta tecnico-service
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
