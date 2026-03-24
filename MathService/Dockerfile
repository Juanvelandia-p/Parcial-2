FROM eclipse-temurin:17

WORKDIR /app

ENV PORT=8080
EXPOSE 8080

COPY target/rest-service-complete-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]