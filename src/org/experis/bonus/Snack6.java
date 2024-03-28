package org.experis.bonus;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero di secondi che vuoi convertire in ore,minuti e secondi");

        int insertedSeconds = scan.nextInt();

        int s = insertedSeconds % 60;

        int h = insertedSeconds / 60;

        int m = h % 60;

        h = h / 60;

        String hours, minutes, seconds;

        if (h < 10) {
           hours = "0"+ h;
        } else {
            hours = Integer.toString(h);
        }
        if (m < 10) {
            minutes = "0"+ m;
        } else {
            minutes = Integer.toString(m);
        }
        if (s < 10) {
            seconds = "0"+ s;
        } else {
            seconds = Integer.toString(s);
        }



        System.out.print(hours + ":" + minutes + ":" + seconds);

    }
}
