package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public String parrotName;

//    public Parrot(String parrotName){
//        this.parrotName = parrotName;
//    }

    public String getParrotName() {
        return this.parrotName;
    }

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
    }
}
