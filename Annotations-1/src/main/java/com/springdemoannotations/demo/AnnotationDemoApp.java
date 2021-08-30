package com.springdemoannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from spring container
        Coach tCoach = context.getBean("tennisCoach", Coach.class);

        // call method on bean
        System.out.println(tCoach.getDailyWorkout());

        //close context
        context.close();
    }
}
