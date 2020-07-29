package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myIntArray = new int[25];//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	    myIntArray[0] = 45;
//	    myIntArray[1] = 476;
//	    myIntArray[5] = 50;

//        for(int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int numberOfElements){
        System.out.println("Enter " + numberOfElements +
                " integer values.\r");
        int[] values = new int[numberOfElements];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " +
                    array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / (double) array.length;
    }
}
