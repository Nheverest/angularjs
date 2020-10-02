### Test urls:

- http://localhost:8080 : angularJS app

- http://localhost:8080/rest/server : access the Server REST resource

- http://localhost:8080/rest/hello : sample basicauth-protected resource

### Running as a capsule:

    mvn clean install
    mvn seedstack:package

Then

    java -jar target/angularjs-capsule.jar

or (one way to override embedded ip value):

    java -Dseedstack.config.server.ip=192.168.0.1 -jar target/angularjs-capsule.jar