package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }


        int largestPrime = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                largestPrime = i;
                number /= i;
                i--;
            }
        }
        return largestPrime;

    }
}
