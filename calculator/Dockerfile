#official OpenJDK runtime is used as a parent image
FROM openjdk:11-jre-slim

# Setting the working directory in the container
WORKDIR /app

# copying the built file.
COPY target/calculator-1.0-SNAPSHOT.jar calculator.jar


# Run the jar file when the container starts
CMD ["java", "-jar", "calculator.jar"]
