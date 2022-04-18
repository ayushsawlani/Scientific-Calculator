FROM openjdk:8
MAINTAINER Ayush Sawlani ayush.sawlani@gmail.com
COPY ./target/Scientific_calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific_calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]