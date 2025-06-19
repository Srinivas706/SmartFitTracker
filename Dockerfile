# Use OpenJDK 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy all files to /app
COPY . .

# Build the Spring Boot project using Maven wrapper
RUN ./mvnw clean install

# Run the built JAR file
CMD ["java", "-jar", "target/*.jar"]
