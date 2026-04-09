# -------- Stage 1: Build WAR --------
FROM maven:3.9.11-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests


# -------- Stage 2: Run WAR --------
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/target/*.war app.war

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.war"]