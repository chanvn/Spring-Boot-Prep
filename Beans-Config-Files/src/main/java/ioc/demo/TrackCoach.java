package ioc.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {

    }
    public TrackCoach(FortuneService fs){
        this.fortuneService = fs;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5 KM";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!: "+ fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: Inside doMyStartupStuff()");
    }

    // add a destroy method
    public void doMyDestroyStuff(){
        System.out.println("TrackCoach: inside method doMyDestroyStuff()");
    }
}
