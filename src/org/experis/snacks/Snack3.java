package org.experis.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = {1,3,65,55,33,32,57,16,9,76,37,10};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            // Se la posizione nell'array è dispari lo aggiungo al counter
            if(i % 2 != 0) {
                counter += numbers[i];
            }
        }

        System.out.println(counter);
    }
}
