# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS stage1
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
COPY --from=stage1 /home/app/target/*.jar hello-world-java.jar
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hello-world-java.jar"]