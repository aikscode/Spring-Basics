package config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    Parrot parrot() {
        Parrot aiksTheParrot = new Parrot();
        aiksTheParrot.setParrotName("Aiks");
        return aiksTheParrot;
    }

    @Bean
    Parrot parrot2() {
        Parrot aiksTheParrot = new Parrot();
        aiksTheParrot.setParrotName("Drew");
        return aiksTheParrot;
    }

    @Bean
    Parrot parrot3() {
        Parrot aiksTheParrot = new Parrot();
        aiksTheParrot.setParrotName("Cage");
        return aiksTheParrot;
    }

//    If you’d like to give another name to the bean, you can use either one of the name
//or the value attributes of the @Bean annotation. Any of the following syntaxes will
//change the name of the bean in "miki":
// @Bean(name = "miki")
// @Bean(value = "miki")
// @Bean("miki")
}
