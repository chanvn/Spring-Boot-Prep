package ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean(s) from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same beans
        boolean result = theCoach == alphaCoach;
        if (result == true){
            System.out.println("Pointing to same object");
        }else{
            System.out.println("Pointing to different object");
        }
        System.out.println("Memory location for theCoach: "+theCoach+"\nMemory location for" +
                "alphaCoach: "+alphaCoach);

        context.close();
    }
}
