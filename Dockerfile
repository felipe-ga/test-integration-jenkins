FROM openjdk:11
COPY [".", "/usr/src/"]
WORKDIR /usr/src
RUN ./gradlew build
COPY ["/build/libs/*.jar", "/usr/src/build/libs/"]
ENTRYPOINT ["java","-Dspring.profile.active=dev","-jar","/build/libs/mutation-1.jar"]
EXPOSE 8080