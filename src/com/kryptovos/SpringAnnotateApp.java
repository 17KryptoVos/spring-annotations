package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotateApp {
    public static void main(String[] args) {

        // Read config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring container
        Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);

        // Execute nethods
        System.out.println(tennisCoach.getDailyWorkout());

        // Close
        context.close();

    }
}
