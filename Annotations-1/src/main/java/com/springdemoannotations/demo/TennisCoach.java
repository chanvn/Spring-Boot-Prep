package com.springdemoannotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // default bean ID will be class name with lowercase first letter (i.e. tennisCoach)
public class TennisCoach implements Coach {

    // Can use field injection - @Autowired directly on the field to resolve the dependency, even for private fields
    // Spring will set the value behind the scenes - uses Java reflection
    @Autowired
    // @Qualifier resolves the dependency injection by making it specific if there are multiple implementations of the
    // same interface - specify using the class name but with first letter lowercase: default with @Component
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> inside default constructor for class TennisCoach");
    }

    // Constructor injection
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

    // Setter injection
    //use @Autowired for a setter injection! Injects the dependency for this bean instance just like the constructor
    // injection
/*    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    // Can use method injection
    // can make your own method too and Autowire it to resolve the dependency
    /* @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println(">> inside doSomeCrazyStuff method -- Doing some crazy stuff");
        this.fortuneService = fortuneService;
    }*/



}
