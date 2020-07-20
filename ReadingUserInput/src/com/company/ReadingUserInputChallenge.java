package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 1;
        int sum = 0;
        while (index < 11){
            System.out.println("Enter number #" + index + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int input = scanner.nextInt();
                sum += input;
                index++;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();

        }

        System.out.println("Sum of all 10 numbers is: " + sum);

        scanner.close();
    }
}
