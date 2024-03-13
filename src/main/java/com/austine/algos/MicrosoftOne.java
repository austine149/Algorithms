package com.api.openBank.algos;

public class MicrosoftOne {
    public static int solution(int A, int B) {
        int totalLenAB = (A+B) / 4;
        while(totalLenAB > 0) {
            int lenA = A / totalLenAB;
            int lenB = B / totalLenAB;
            if(lenA + lenB >= 4) return totalLenAB;
            --totalLenAB;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println((solution(10,21)));
    }
}
