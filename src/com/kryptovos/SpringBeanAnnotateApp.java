package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanAnnotateApp {
    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Coach theFirstCoach = context.getBean("tennisCoach", Coach.class);
        Coach theSecondCoach = context.getBean("tennisCoach", Coach.class);

        // execute method
        boolean result = (theFirstCoach == theSecondCoach);
        System.out.println("Is it the same? " + result);

        // close bean
        context.close();
    }
}
