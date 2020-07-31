package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //TODO: Read the count from the console and call the method
        //readIntegers() with the count parameter. Then call the
        //findMin() method assign the array returned form readIntegers()
        //TODO: Print the minimum element in the array

        System.out.println("Please enter count of integers: \r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println(findMin(array));

        scanner.close();
    }

    public static int[] readIntegers(int count){
        //TODO: The method needs to read form console until all numbers
        //are entered, and then return an array containing the numbers
        //entered

        int[] array = new int[count];

        for (int i = 0; i< count; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array){
        //TODO: The method needs to return the minimum value in the array

        int min = array[0];

        for (int i : array) {
            if(i < min){
                min = i;
            }
        }

        return min;
    }
}
