FROM eclipse-temurin:21-jdk 
WORKDIR /app
COPY target/fibonacci-seriess-*.jar app.jar               
CMD ["java", "-jar", "app.jar"]