package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        boolean isNegative = false;
        if(number < 0){
            isNegative = true;
            number = Math.abs(number);
        }

        int startingNumber = number;
        int currentDigit = 0;
        int reversedNumber = 0;

        while (number >= 10){
            currentDigit = number % 10;
            number /= 10;
            reversedNumber += currentDigit;
            reversedNumber *= 10;
        }

        reversedNumber += number;

        if(isNegative){
            startingNumber = -startingNumber;
            reversedNumber = -reversedNumber;
        }

        return  startingNumber == reversedNumber;

    }
}
