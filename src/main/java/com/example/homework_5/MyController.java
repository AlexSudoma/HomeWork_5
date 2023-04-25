package com.example.homework_5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    private final MyBean myBean;

    public MyController(MyBean myBean) {
        this.myBean = myBean;
    }

    @RequestMapping("/")
    public void handleRequest() {
        System.out.println("MyController handling request with MyBean");
        myBean.doSomething();
    }

    @PostConstruct
    public void logBeanCreation() {
        System.out.println("MyController created");
    }
}
