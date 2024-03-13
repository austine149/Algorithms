package com.api.openBank.algos;

public class MicrosoftQuizTwo {
    /**
     * Write a function that given an integer N, returns the smallest number with the same number of digits. You can assume N is between 1 and a billion
     *
     * For example given N=125, the function should return 100.
     * Given N=10 , the function should return 1. Given N=1, the function should return 0.
     */
    public static int solution(int N) {
        if (N >= 1 && N < 10) {
            return 0;
        }
        int numDigits = (int) Math.log10(N) + 1;
        int smallestNumber = (int) Math.pow(10, numDigits - 1);
        return smallestNumber;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
