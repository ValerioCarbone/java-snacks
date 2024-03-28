package org.experis.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int givenNumber;


        // codice da eseguire
      do {
          System.out.println("Pick a number between 10 and 20");

          givenNumber = Integer.parseInt(scan.nextLine());

          System.out.println(givenNumber);

      } // condizione per ripetere il ciclo
      while (givenNumber > 20 || givenNumber < 10 || givenNumber % 2 != 0);

        System.out.println("The number is correct!");

        scan.close();
    }
}
