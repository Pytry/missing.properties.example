package my.missing.properties.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Keith Hoopes on 6/28/2016.
 * Copyright Bear River Mutual 2016.
 */
@RequestMapping("/")
@RestController
public class GreetingController {


    @Value("${example.greeting}")
    private String greeting;

    @RequestMapping("/")
    public String greeting(){

        return greeting;
    }
}
