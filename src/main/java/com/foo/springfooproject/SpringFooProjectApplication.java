package com.foo.springfooproject;

import models.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class SpringFooProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringFooProjectApplication.class, args);
        Coder coder = (Coder) context.getBean("coder1");
//        Coder coder2 = (Coder) context.getBean("coder2");
        System.out.println(coder.getName());
        System.out.println(coder.getLanguage());
        System.out.println(coder.getComputer().getBrand());
    }

}
