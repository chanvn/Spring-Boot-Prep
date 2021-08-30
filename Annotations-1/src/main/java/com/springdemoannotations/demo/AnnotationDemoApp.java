package com.springdemoannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from spring container
        Coach tCoach = context.getBean("tennisCoach", Coach.class);
        //Coach hCoach = context.getBean("hockeyCoach",Coach.class);

        // call method on bean
        System.out.println(tCoach.getDailyWorkout());
        System.out.println(tCoach.getDailyFortune());
        //System.out.println("---------------End of Tennis Coach ------------------");
        //System.out.println(hCoach.getDailyWorkout());

        //close context
        context.close();
    }
}
