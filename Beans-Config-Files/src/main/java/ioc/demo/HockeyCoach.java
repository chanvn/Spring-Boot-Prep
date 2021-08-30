package ioc.demo;

public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "5 full speed laps and a full set of drills with your line-mates.";
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
