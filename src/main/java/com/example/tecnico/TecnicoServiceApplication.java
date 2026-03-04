package com.example.tecnico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TecnicoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TecnicoServiceApplication.class, args);
    }

    // Declaramos RestTemplate para poder usarlo en nuestros controladores
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
