FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
LABEL version="1.0"
LABEL env="qe"
USER spring:spring
ARG JAR_FILE=target/timesheet-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java"]
CMD ["-jar","/app.jar"]
