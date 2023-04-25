package com.example.homework_5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final MyBean myBean;

    public MyComponent(MyBean myBean) {
        this.myBean = myBean;
    }

    public void doSomething() {
        System.out.println("MyComponent doing something with MyBean");
        myBean.doSomething();
    }

    @PostConstruct
    public void logBeanCreation() {
        System.out.println("MyComponent created");
    }
}
