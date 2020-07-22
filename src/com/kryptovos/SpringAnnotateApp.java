package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotateApp {
    public static void main(String[] args) {

        // Read config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // Execute nethods
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());


        System.out.println("----------------------");

        FoodCoach foodCoach = context.getBean("foodCoach", FoodCoach.class);
        System.out.println(foodCoach.getDailyFortune());
        System.out.println(foodCoach.getDailyWorkout());
        System.out.println(foodCoach.getTeam());
        System.out.println(foodCoach.getEmail());

        System.out.println("----------------------");



        // Close
        context.close();

    }
}
