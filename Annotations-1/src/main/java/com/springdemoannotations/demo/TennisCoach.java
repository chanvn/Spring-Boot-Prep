package com.springdemoannotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // default bean ID will be class name with lowercase first letter (i.e. tennisCoach)
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> inside default constructor for class TennisCoach");
    }
    // use @Autowired to inject FortuneService into the constructor automatically using spring
    // Spring scans for a component that implements the FortuneService interface!
    /*
    @Autowired
    public TennisCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Hit 15 tennis balls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //use @Autowired for a setter injection! Injects the dependency for this bean instance just like the constructor
    // injection
/*    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    // can make your own method too and Autowire it to resolve the dependency
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println(">> inside doSomeCrazyStuff method -- Doing some crazy stuff");
        this.fortuneService = fortuneService;
    }



}
