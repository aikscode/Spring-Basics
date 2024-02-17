package org.example;

import config.ConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Parrot blueParrot = new Parrot();
        System.out.println(blueParrot);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Parrot parrotAiks = context.getBean("parrot", Parrot.class);
        Parrot parrotCage= context.getBean("parrot2", Parrot.class);
        System.out.println(parrotAiks.getParrotName() + " " + parrotCage.getParrotName());
    }
}