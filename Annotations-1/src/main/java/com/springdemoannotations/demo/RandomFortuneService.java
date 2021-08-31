package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Keep your work safe", "Work hard", "Journey is the reward"
    };

    // create an RNG
    private Random rng = new Random();

    @Override
    public String getFortune() {
        int randomNum = rng.nextInt(data.length);
        return data[randomNum];
    }
}
