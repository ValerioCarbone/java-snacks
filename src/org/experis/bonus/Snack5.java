package org.experis.bonus;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");

        String insertedString = scan.nextLine();

        String cleanedString =  insertedString.replaceAll(" ","").toLowerCase();

        char[] charArray = cleanedString.toCharArray();

        int alphabeticCounter = 0;
        int numericCounter = 0;
        int symbolsCounter = 0;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                alphabeticCounter++;
            } else if(charArray[i] >= '0' && charArray[i] <= '9') {
                numericCounter++;
            } else {
                symbolsCounter++;
            }

        }

        System.out.println("Nella stringa '"+insertedString+"' ci sono " + alphabeticCounter +" caratteri alfabetici, "+ numericCounter + " caratteri numerici e "+symbolsCounter+" simboli");

    }
}
