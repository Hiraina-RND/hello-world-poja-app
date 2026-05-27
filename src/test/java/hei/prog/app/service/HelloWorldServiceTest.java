package hei.prog.app.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldServiceTest {

    @Test
    void sayHello() {
        HelloWorldService helloWorldService = new HelloWorldService();

        assertEquals("Hello world!", helloWorldService.sayHello());
    }
}