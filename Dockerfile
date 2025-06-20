# Start from a base image with JDK and Maven pre-installed
FROM maven:3.9.6-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy source code
COPY . .

# Build the project (skip tests to save time)
RUN mvn clean package -DskipTests

# Run the jar
CMD ["sh", "-c", "java -jar target/*.jar"]
