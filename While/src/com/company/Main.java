package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        System.out.println("While loop");
	    while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("For loop:");
	    for(int i = 1; i < 7; i++){
            System.out.println("Count value is " + i);
        }

        System.out.println("While loop");
	    count = 1;
	    while (true){
	        if (count == 6){
	            break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }


        System.out.println("Do while loop");
	    count = 1;
	    do{
            System.out.println("Count value is " + count);
            count++;
        } while(count != 6);


	    int number = 4;
	    int finishNumber = 20;
	    int evenNumbersCount = 0;

	    while(number <= finishNumber){
            number++;

	        if(!isEvenNumber(number)){
	            continue;
            }
            evenNumbersCount++;
            if(evenNumbersCount == 5){
                break;
            }
            System.out.println("Even number "+ number);
        }

        System.out.println(DigitSum.sumDigits(2222));

        System.out.println(NumberPalindrome.isPalindrome(10));

        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(6442));

        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));

        System.out.println(SharedDigit.hasSharedDigit(12, 33));

        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99 , 999));

        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(1010, 10));

        FactorialPrinter.printFactors(10);

        System.out.println(PerfectNumber.isPerfectNumber(5));

        NumberToWords.numberToWords(1000);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
