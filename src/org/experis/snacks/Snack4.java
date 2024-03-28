package org.experis.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa e controllerò se sia palindroma");

        String insertedString = scan.nextLine();

        String cleanedString =  insertedString.replaceAll(" ","").toLowerCase();

        char[] charArray = cleanedString.toCharArray();

        int fromLastCounter = charArray.length - 1;

        boolean isPalindrome = true;

        for (int i = 0; i < charArray.length ; i++) {

            if (charArray[i] != charArray[fromLastCounter]) {
                isPalindrome = false;
                i = charArray.length;
            }
            fromLastCounter--;

            if (i > fromLastCounter) {
                i = charArray.length;
            }

        }

        if(isPalindrome) {
            System.out.println("La stringa '"+ insertedString +"' è palindroma");
        } else {
            System.out.println("La stringa '"+ insertedString +"' non è palindroma");
        }
    }
}
