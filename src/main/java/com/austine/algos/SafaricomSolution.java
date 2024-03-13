package com.api.openBank.algos;

/**
 * You are given two arrays A and B consisting of N integers each.
 * Index K is named fair if the four sums (A[0] + ... + A[K-1]), (A[K] + ... + A[N-1]), (B[0] + ... + B[K-1]) and (B[K] + ... + B[N-1]) are all equal.
 * In other words, K is the index where the two arrays, A and B, can be split (into two non-empty arrays each)
 * in such a way that the sums of the resulting arrays' elements are equal. For example,
 * given arrays A = [0, 4, -1, 0, 3] and B = [0, -2, 5, 0, 3], index K = 3 is fair.
 *
 * The sums of the four subarrays are all equal: 0 + 4 + (-1) = 3; 0 + 3 = 3; 0+(-2) + 5 = 3 and 0 + 3 = 3. On the other hand, index K = 2 is not fair,
 * the sums of the subarrays are: 0 + 4 = 4; (-1) + 0 + 3 = 2; 0+(-2) = -2 and 5 + 0 + 3 = 8.
 * Write a function:
 * class Solution { public int solution(int[] A, int[] B); }
 * which, given two arrays of integers A and B, returns the total number of fair indexes.
 *
 * Examples:
 * 1. Given A = [0, 4, -1, 0, 3] and B = [0, -2, 5, 0, 3], your function should return 2. The fair indexes are 3 and 4.
 * In both cases, the sums of elements of the subarrays are equal to 3.
 * 2. Given A = [2, -2, -3, 3] and B = [0, 0, 4, -4], your function should return 1.
 * The only fair index is 2. Index 4 is not fair as the subarrays containing indexes from K to N - 1 would be
 * empty.
 * 3. Given A = [4, -1, 0, 3] and B = [-2, 6, 0, 4], your function should return 0. There are no fair indexes.
 * 4. Given A = [3, 2, 6] and B = [4, 1, 6], your function should return 0.
 * 5. Given A = [1, 4, 2, -2, 5], B = [7, -2, -2, 2, 5], your function should return 2. The fair indexes are 2 and 4.
 */
public class SafaricomSolution {
    //Implementation 1
    public static int solution(int[] A, int[] B) {
        int length=A.length;
        int sumA=0;
        int sumB=0;
        int sumA_=0;
        int sumB_=0;
        int count=0;
        for(int i=0;i<length;i++){
            sumA=sumA+A[i];
            sumB=sumB+B[i];
        }
        for(int i=0;i<length;i++){
            sumA_=sumA_+A[i];
            sumB_=sumB_+B[i];
            if((sumA_==(sumA-sumA_)) && (sumB_==(sumB-sumB_)) && (sumA_==sumB_)){
                count++;
            }
        }

        return count;
    }


    //Implementation 2
//    public static int solution(int[] A, int[] B) {
//        int n = A.length;
//        int[] sumA = new int[n + 1];
//        int[] sumB = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            sumA[i] = sumA[i - 1] + A[i - 1];
//            sumB[i] = sumB[i - 1] + B[i - 1];
//        }
//        int count = 0;
//        for (int i = 1; i < n; i++) {
//            if (sumA[i] == sumA[n] - sumA[i] && sumB[i] == sumB[n] - sumB[i]) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        int[] A={4, -1, 0, 3};
        int[] B={-2, 6, 0, 4};
        System.out.println(solution(A, B));
//        [0, 4, -1, 0, 3], [0, -2, 5, 0, 3]
//        [2, -2, -3, 3], [0, 0, 4, -4]
//        [3, 2, 6], [4, 1, 6]
//        [1, 4, 2, -2, 5], [7, -2, -2, 2, 5]
    }
}
