# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/user-registration-system-1.0-SNAPSHOT.jar app.jar

# Run application
CMD ["java", "-jar", "app.jar"]