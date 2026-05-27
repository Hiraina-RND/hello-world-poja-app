package hei.prog.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldServiceTest {

  @Test
  void sayHello() {
    HelloWorldService helloWorldService = new HelloWorldService();

    assertEquals("Hello world!", helloWorldService.sayHello());
  }
}
