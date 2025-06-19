FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# 🔧 Make mvnw executable before running it
RUN chmod +x mvnw && ./mvnw clean install

CMD ["java", "-jar", "target/*.jar"]
