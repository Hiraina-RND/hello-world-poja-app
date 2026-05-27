package hei.prog.app.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.*;

import hei.prog.app.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class HelloWorldControllerTest {

  @Test
  void hello() {
    HelloWorldService helloWorldService = new HelloWorldService();
    ResponseEntity<String> helloWorldControllerResponse =
        new HelloWorldController(helloWorldService).hello();

    assertEquals(200, helloWorldControllerResponse.getStatusCode().value());
    assertEquals("Hello world!", helloWorldControllerResponse.getBody());
  }
}
