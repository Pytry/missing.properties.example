package my.missing.properties.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${greeting.config.url}")
public class GreetingApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {

        SpringApplication.run(GreetingApplication.class, args);
    }
}
