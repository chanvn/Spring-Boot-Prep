package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Bodes well!";
    }
}
