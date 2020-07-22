package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotateApp {
    public static void main(String[] args) {

        // Read config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach foodCoach = context.getBean("foodCoach", Coach.class);

        // Execute nethods
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(foodCoach.getDailyWorkout());

        // Close
        context.close();

    }
}
