package ua.naiksoftware.example_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ua.naiksoftware.example_server")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}