package com.example.homework_5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    private final MyBean myBean;

    public MyRepository(MyBean myBean) {
        this.myBean = myBean;
    }

    public void saveData() {
        System.out.println("MyRepository saving data with MyBean");
        myBean.doSomething();
    }

    @PostConstruct
    public void logBeanCreation() {
        System.out.println("MyRepository created");
    }
}
