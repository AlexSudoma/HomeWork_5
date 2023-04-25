package com.example.homework_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean(name = "myBean")
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean(name = "myBean2")
    public MyBean createMyBean2() {
        return new MyBean();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        MyComponent myComponent = context.getBean(MyComponent.class);
        myComponent.doSomething();

        MyController myController = context.getBean(MyController.class);
        myController.handleRequest();

        MyRepository myRepository = context.getBean(MyRepository.class);
        myRepository.saveData();

        MyService myService = context.getBean(MyService.class);
        myService.process();

        logBeans(context);
    }

    private static void logBeans(ApplicationContext context) {
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName + " created");
        }
    }
}
