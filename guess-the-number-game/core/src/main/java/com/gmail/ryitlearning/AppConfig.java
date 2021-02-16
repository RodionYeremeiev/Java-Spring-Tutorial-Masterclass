package com.gmail.ryitlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gmail.ryitlearning")
public class AppConfig {

    // == bean methods ==
    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGenetratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
