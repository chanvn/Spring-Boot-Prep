package ioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class InversionOfControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(InversionOfControlApplication.class, args);
        //create the object
        Coach theCoach = new HockeyCoach();
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
