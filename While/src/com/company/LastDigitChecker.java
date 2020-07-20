package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberA, int numberB, int numberC){
        if(!isValid(numberA) || !isValid(numberB) || !isValid(numberC)){
            return false;
        }

        int lastDigitA = numberA % 10;
        int lastDigitB = numberB % 10;
        int lastDigitC = numberC % 10;

        return lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
