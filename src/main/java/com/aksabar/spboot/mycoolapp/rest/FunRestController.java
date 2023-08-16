package com.aksabar.spboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    // '/' end point for hello world.
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is ";
    }

    // '/workout' end point for workout.
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // '/fortune' end point for fortune.
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}