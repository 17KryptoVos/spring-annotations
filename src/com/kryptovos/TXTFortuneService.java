package com.kryptovos;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class TXTFortuneService implements FortuneService {

    private String fileName = "D:\\java\\projects\\spring-annotations\\src\\com\\kryptovos\\data.txt";
    private List<String> loadedFortunes;

    //Random number generator
    Random rand = new Random();

    public TXTFortuneService() {
        File file = new File(fileName);
        System.out.println("Reading fortunes from file: " + file);
        System.out.println("File exists: " + file.exists());

        // init arrayList
        loadedFortunes = new ArrayList<>();

        // read file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String tempLine;
            while ((tempLine = br.readLine()) != null) {
                loadedFortunes.add(tempLine);
                System.out.println("Added quote!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune() {
        //pick random string from the array
        System.out.println("Length is: " + loadedFortunes.size());
        int index = rand.nextInt(loadedFortunes.size()); // Bound is exclusive
        return loadedFortunes.get(index);


    }
}
