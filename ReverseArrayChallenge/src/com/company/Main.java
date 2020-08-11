package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed: " + Arrays.toString(array));

        int[] secondArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(secondArray));
        reverse(secondArray);
        System.out.println("Reversed: " + Arrays.toString(secondArray));
    }

    public static void reverse(int[] array){
        int currentElement;
        int lastElementIndex = array.length - 1;

        if(array.length % 2 == 0){
            for(int i = 0; i <= array.length / 2; i++){
                currentElement = array[i];
                array[i] = array[lastElementIndex];
                array[lastElementIndex] = currentElement;
                lastElementIndex--;
            }
        } else {
            for(int i = 0; i <= array.length % 2; i++){
                currentElement = array[i];
                array[i] = array[lastElementIndex];
                array[lastElementIndex] = currentElement;
                lastElementIndex--;
            }
        }

    }
}
