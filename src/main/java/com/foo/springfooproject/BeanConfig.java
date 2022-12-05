package com.foo.springfooproject;

import models.Coder;
import models.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coder setterInjCoder(@Qualifier("setterInjComputer") Computer computer){
        Coder coder = new Coder();
        coder.setId(1036);
        coder.setName("Abu Horaira");
        coder.setLanguage("Java");
        coder.setComputer(computer);
        return coder;
    }

    @Bean
    public Computer setterInjComputer(){
        Computer computer = new Computer();
        computer.setBrand("AMD");
        return computer;
    }

    @Bean
    public Coder constructorInjCoder(@Qualifier("constructorInjComputer") Computer computer){
        return new Coder(1036, "Abu Horaira Mobin", "JavaScript", computer);
    }

    @Bean
    public Computer constructorInjComputer(){
        return new Computer("Intel");
    }


}
