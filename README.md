To execute this project is necesary to have Apache Maven installed and then run, in the command prompt, "mvn spring-boot:run" (we must to be situated in the project directory).

The application start a server using port 8080 in localhost machine.

To try an endpoint, we can execute this URL in the web browser "http://localhost:8080/properties" with a body thath conteins a Json like this "{ "page": 1, "limit": 20 }" This REST endpoint call to https://api.stagingeb.com/v1/properties endpoint provided by EasyBroker.