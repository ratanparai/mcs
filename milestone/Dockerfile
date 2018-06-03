FROM openjdk:8-jdk-alpine AS base
EXPOSE 8080

FROM maven AS build
WORKDIR /app
COPY pom.xml .
RUN mvn clean verify --fail-never
COPY . .
RUN mvn package

FROM base AS final
WORKDIR /app
COPY --from=build /app/target/milestone-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "milestone-0.0.1-SNAPSHOT.jar" ]
