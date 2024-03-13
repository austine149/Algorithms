package com.austine.algos;

public class MicrosoftQuizThree {
    /**
     * You are a programmer in a scientific team doing research into particles. As an experiment, you have measured the position of a single particle in N equally distributed moments of time.
     * The measurement made in moment K is recorded in array A as A[K].
     * Now your job is to count all the periods of time when the movement of the particle was stable. Those are the periods during which the particle doesn't change its velocity. i.e. the difference between any two consecutive position measurements remains the same. note that you need at least three measurements to be sure that the particle didn't change its velocity
     *
     * For example:
     * 1,3,5,7,9 is stable (velocity is 2)
     * 1,1,2,5,7 is not stable  (valocity changes between measurements)
     * More formally, your task is to find all the periods of time A[P], A[P+1],...A[Q] ( of length atleast 3) during which the movement of the particle is stable. Note that some periods of time might be contained in others.
     *
     * Write a function:
     *
     * class Solution {
     * public int solution(int[] A){}
     * }
     *
     * that given array A consisting of N integers representing the results of the measurements, returns the number of periods of time when the movement of the particle was stable. The function should return -1 if the result exceeds 1000000000.
     */
    public static int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 2; i++) {
            int diff = A[i + 1] - A[i];
            for (int j = i + 2; j < A.length; j++) {
                if (A[j] - A[j - 1] == diff) {
                    count++;
                } else {
                    break;
                }
            }
        }
        if (count > 1000000000) {
            return -1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        int[] A={-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
        System.out.println(solution(A));
    }
}
