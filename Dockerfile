FROM openjdk:11
EXPOSE 8080
ADD target/springbootbasics-0.0.1-SNAPSHOT.war springbootbasics-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java", "-jar", "/springbootbasics-0.0.1-SNAPSHOT.war"]