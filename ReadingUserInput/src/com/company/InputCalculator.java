package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            int number;
            if(hasNextInt) {
                number = scanner.nextInt();
            } else {
                break;
            }

            sum += number;
            count++;


            scanner.nextLine();
        }

        long average = (long) Math.ceil((float)sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
