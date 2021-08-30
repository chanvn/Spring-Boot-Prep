package ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        // Load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bean from the spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        HockeyCoach hCoach = context.getBean("hockeyCoach", HockeyCoach.class);
        // Call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        System.out.println("Coaches email: "+theCoach.getEmailAddress());
        System.out.println("Coaches fav team: "+theCoach.getTeam());
        System.out.println("---------------------------------END OF CRICKET COACH------------------------------");

        System.out.println("Hockey fortune: "+hCoach.getDailyFortune());
        // Close the context
        context.close();
    }
}
