FROM openjdk:17
WORKDIR /app
COPY target/menu.jar menu.jar
ENTRYPOINT ["java", "-jar", "menu.jar"]
