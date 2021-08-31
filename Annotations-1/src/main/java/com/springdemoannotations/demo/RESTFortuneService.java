package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

@Component // @Component allows Spring to auto-scan these beans for DIs and IoC
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
