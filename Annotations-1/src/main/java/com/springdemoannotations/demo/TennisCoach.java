package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

@Component // default bean ID will be class name with lowercase first letter (i.e. tennisCoach)
public class TennisCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Hit 15 tennis balls";
    }
}
