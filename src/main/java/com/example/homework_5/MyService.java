package com.example.homework_5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyBean myBean;

    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public void process() {
        System.out.println("MyService processing with MyBean");
        myBean.doSomething();
    }

    @PostConstruct
    public void logBeanCreation() {
        System.out.println("MyService created");
    }
}
