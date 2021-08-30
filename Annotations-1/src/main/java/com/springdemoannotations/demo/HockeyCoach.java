package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your slapshot!";
    }
}
