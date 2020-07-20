package com.company;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);
        number = reverse(number);

        for(int i = 0; i < digitCount; i++){
            int currentDigit = number % 10;
            switch (currentDigit){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0: default:
                    System.out.println("Zero");
                    break;
            }

            number /= 10;
        }


    }

    public static int reverse(int number){
        int reversedNumber = 0;
        boolean isNegative = number < 0;
        if(isNegative) {
            number = Math.abs(number);
        }

        while (number > 0){
            reversedNumber += number % 10;
            number /= 10;
            reversedNumber *= 10;
        }

        reversedNumber /= 10;

        if(isNegative){

            return -reversedNumber;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int digitCount = 1;

        if(number == 0) {
            return 1;
        } else {
            while (number > 0){
                number /= 10;
                digitCount++;
            }
        }

        return digitCount;

    }
}
