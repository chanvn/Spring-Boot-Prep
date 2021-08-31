package com.springdemoannotations.demo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService {
    private String fileName = "C:\\Users\\chanv\\Documents\\Self-Teach\\Spring-boot\\Spring-Boot-Prep\\Annotations-1\\src\\main\\resources\\fortunes.txt";
    ArrayList<String> fortunes;

    private Random rng = new Random();

    public DatabaseFortuneService(){
        File theFile = new File(fileName);
        fortunes = new ArrayList<String>();

        System.out.println("File exists?: "+theFile.exists());

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                fortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = rng.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
