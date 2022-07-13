FROM java:8

EXPOSE 8080

ADD target/arjundemo1.jar arjundemo1.jar

ENTRYPOINT ["java","-jar","arjundemo1.jar"]