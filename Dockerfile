FROM amazoncorretto:11

MAINTAINER BUCKETEAM

COPY target/backEnd-0.0.1-SNAPSHOT.jar leon-app.jar 

ENTRYPOINT ["java","-jar","/leon-app.jar"]