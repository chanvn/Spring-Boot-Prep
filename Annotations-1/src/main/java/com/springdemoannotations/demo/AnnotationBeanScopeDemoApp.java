package com.springdemoannotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they're the same object
        boolean result = (theCoach == alphaCoach);

        // print out results
        System.out.println("\nPointing to same object?: "+result);

        System.out.println("\nMemory location for theCoach: "+theCoach);

        System.out.println("\nMemory location for alphaCoach: "+ alphaCoach+"\n");

        // close the context
        context.close();
    }
}
