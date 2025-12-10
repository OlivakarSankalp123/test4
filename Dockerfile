FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY docker-test-0.0.1-SNAPSHOT.jar docker-test-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "docker-test-0.0.1-SNAPSHOT.jar"]
