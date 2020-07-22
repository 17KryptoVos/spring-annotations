package com.kryptovos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    // Define private field for the dependency

//    Field injections
//    @Autowired
//    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // No arg constructor
    public TennisCoach() {
        System.out.println("Default no-arg constructor");
    }

    /*
    // Define constructor for dependecy injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    // Combining Autowired with constructor
    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {

        return "Practice backhand everyday";
    }

    @Override
    public String getDailyFortune() {

        // Use my fortuneService to get a fortune
        return fortuneService.getFortune();

    }

    /*
    // Setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method!");
        this.fortuneService = fortuneService;
    }
     */

    /*
    @Autowired
    // Method inejction
    public void doSomeCrazystuff(FortuneService fortuneService) {
        System.out.println("Inside custom method");
        this.fortuneService = fortuneService;
    }
     */
}
