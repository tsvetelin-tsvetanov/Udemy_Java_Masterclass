package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static com.company.Main.printArray;

public class Challenge {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        sortIntegers(numbers);
        printArray(numbers);


    }

    public static int[] getIntegers(int numberOfElements) {
        System.out.println("Enter " + numberOfElements +
                " integer values.\r");

        int[] values = new int[numberOfElements];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void sortIntegers(int[] numbers) {
        Arrays.sort(numbers);
    }

    public static void printArray ( int[] numbers){
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }
    }

}
