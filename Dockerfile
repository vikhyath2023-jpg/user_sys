# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy jar file from target folder
COPY target/recommendation-system-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]