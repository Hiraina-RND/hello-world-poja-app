package hei.prog.app.endpoint.rest.controller.health;

import hei.prog.app.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {
  HelloWorldService helloWorldService;

  @GetMapping("/hello")
  ResponseEntity<String> hello() {
    return new ResponseEntity<>(helloWorldService.sayHello(), HttpStatusCode.valueOf(200));
  }
}
