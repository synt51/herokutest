FROM openjdk:17

MAINTAINER Heinz <heinz.schloemer@gmx.net>

ADD /target/herokutest-0.0.1-SNAPSHOT.jar hellodocker.jar

CMD ["sh", "-c", "java -jar /hellodocker.jar"]