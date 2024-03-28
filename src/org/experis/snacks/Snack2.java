package org.experis.snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        String[] names = {"Pippo", "Paolo", "Marco", "Giulio", "Matteo", "Alessandro", "Francesco"};

        String[] surnames = {"Travolta", "Di Caprio", "Pacino", "Pesci", "Jackson", "Maradona", "Martinez"};

        Random randomGenerator = new Random();

        System.out.println("Ecco la lista degli invitati:");

        int currentNameIndex, currentSurnameIndex;


        for (int i = 0; i < 20; i++) {

            currentNameIndex = randomGenerator.nextInt(names.length);

            currentSurnameIndex = randomGenerator.nextInt(surnames.length);

            System.out.println(names[currentNameIndex] + " " + surnames[currentSurnameIndex]);

        }
    }
}
