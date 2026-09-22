package edu.eci.tdse.com.web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(RestServiceApplication.class);

        application.setDefaultProperties(
                Map.of("server.port",
                        System.getenv().getOrDefault("PORT", "9000")));

        application.run(args);
    }
}
