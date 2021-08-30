package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Hit 15 tennis balls";
    }
}
