package com.kryptovos;

import org.springframework.stereotype.Component;

@Component
public class FoodCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Eat 3 chocobars";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
