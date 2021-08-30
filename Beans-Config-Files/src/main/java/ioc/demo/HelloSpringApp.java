package ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {
    public static void main(String[] args){
        //1. load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class); //get a fully assembled bean
                                                                            //with dependencies!
        //3. call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        // can call new method for fortunes
        System.out.println(theCoach.getDailyFortune());
        //4. close the context
        context.close();
    }
}
