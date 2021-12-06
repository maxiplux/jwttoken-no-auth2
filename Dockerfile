# Start with a base image containing Java runtime
#Sorry if you are reding this file with a lot of  errors , those errors are because I'll need  something to run on kubernetes
# Loockup on git the history to find the right version with alpine
#FROM openjdk:12-jdk-alpine
FROM  adoptopenjdk/openjdk12:latest


# Add Maintainer Info
RUN apt-get update
RUN apt-get -y install software-properties-common mc htop stress
# Add a volume pointing to /tmp
VOLUME /tmp
# Make port 8080 available to the world outside this container
EXPOSE 8080
# The application's jar file
ARG JAR_FILE=target/jwttoken-no-auth2-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
COPY ${JAR_FILE} app.jar
# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#docker build -t maxiplux/calculator .
#docker tag  356503c90822 maxiplux/calculator:1.0.3
#docker push maxiplux/calculator:1.0.3
