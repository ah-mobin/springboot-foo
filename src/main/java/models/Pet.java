package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    @Autowired
    Dog dog;

    public void dogInfo(){
        dog.info();
    }
}
