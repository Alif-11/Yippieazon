# Stage 1: Build the application
FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app
COPY . .

# Ensure the Gradle wrapper is executable
RUN chmod +x ./gradlew

# Build the Spring Boot JAR and skip tests
RUN ./gradlew clean build -x test

# Stage 2: Run the application from a slim image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy the fat JAR from the build stage
COPY --from=build /app/build/libs/render-0.0.1-SNAPSHOT.jar app.jar

# Start the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]