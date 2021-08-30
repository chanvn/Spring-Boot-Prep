package com.springdemoannotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // default bean ID will be class name with lowercase first letter (i.e. tennisCoach)
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    // use @Autowired to inject FortuneService into the constructor automatically using spring
    // Spring scans for a component that implements the FortuneService interface!
    @Autowired
    public TennisCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit 15 tennis balls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
