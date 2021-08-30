package ioc.demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    // create variables for literal values
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter method - setEmailAddress!");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside setter method - setTeam!");
        this.team = team;
    }

    // create a no-arg constructors
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the 6's";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket: "+fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: Inside setter method - setFortuneService!");
        this.fortuneService = fortuneService;
    }
}
