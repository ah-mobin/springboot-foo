package models;

import jakarta.annotation.PreDestroy;

public class Computer {

    private String brand;

    public Computer(){
        super();
    }


    public Computer(String brand){
        super();
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }


    public void setBrand(String brand){
        this.brand = brand;
    }

    @PreDestroy
    public void destroy(){

    }

}
