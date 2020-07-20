package com.company;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            int number;
            if(hasNextInt) {
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid number");
                break;
            }

            if(number > maxNumber){
                maxNumber = number;
            }

            if(number < minNumber){
                minNumber = number;
            }

            scanner.nextLine();
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);

        scanner.close();
    }
}
