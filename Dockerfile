FROM openjdk:8
EXPOSE 8080
ADD target/jenkindockerimage.jar jenkindockerimage.jar
ENTRYPOINT ["java","-jar","/jenkindockerimage.jar"]