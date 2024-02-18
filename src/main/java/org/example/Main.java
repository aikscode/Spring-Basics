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
        Parrot parrotBean = context.getBean(Parrot.class);
        System.out.println(parrotBean.getParrotName());
    }
}