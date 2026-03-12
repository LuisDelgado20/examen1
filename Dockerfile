FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copiamos el JAR desde la etapa de compilación
COPY --from=build /app/target/tabla9-0.0.1-SNAPSHOT.jar app.jar