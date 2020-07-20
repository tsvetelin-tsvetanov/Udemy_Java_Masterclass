package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 ||
                secondNumber < 10 || secondNumber > 99){
            return false;
        }

        int firstDigitA = firstNumber / 10;
        int secondDigitA = firstNumber % 10;
        int firstDigitB = secondNumber / 10;
        int secondDigitB = secondNumber % 10;

        return firstDigitA == firstDigitB ||
                firstDigitA == secondDigitB ||
                secondDigitA == firstDigitB ||
                secondDigitA == secondDigitB;

    }
}
