package com.kryptovos;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Beware of the wolf",
            "Creative quote number 1",
            "Stuff and things"
    };

    // random number generator
    private Random rand = new Random();

    @Override
    public String getFortune() {
        //pick random string from the array
        System.out.println("Length is: " + data.length);
        int index = rand.nextInt(data.length); // Bound is exclusive
        return data[index];
    }
}


