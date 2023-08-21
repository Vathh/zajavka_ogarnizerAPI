FROM eclipse-temurin:17
COPY build/libs/*.jar app2.jar
ENTRYPOINT ["java","-jar","/app2.jar"]