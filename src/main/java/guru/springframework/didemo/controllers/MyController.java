package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class MyController {

    private final GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostConstruct
    public void init() {
        System.out.println("[INITIALIZED] MyControll");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[TERMINATION] MyControll");
    }

    public String hello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }

}
