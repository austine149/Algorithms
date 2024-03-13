package com.api.openBank.algos;

import java.util.ArrayList;
import java.util.List;

public class MicrosoftTwo {
    public static int solution(int[] A, int[] B) {
        int N = A.length;
        List<Integer> candiesA = new ArrayList<>();
        List<Integer> candiesB = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                if (!candiesA.contains(A[i])) {
                    if (candiesA.size() < ((N / 2))) {
                        candiesA.add(A[i]);
                    }
                }
                if (!candiesA.contains(A[i])) {
                    if (candiesA.size() < ((N / 2))) {
                        candiesB.add(B[i]);
                    }
                }
            } else {
                if (!candiesA.contains(A[i])) {
                    if (candiesA.size() < ((N / 2))) {
                        candiesA.add(A[i]);
                    }
                }
                if (!candiesB.contains(B[i])) {
                    if (candiesB.size() < ((N / 2))) {
                        candiesB.add(B[i]);
                    }
                }
            }
        }
        return candiesB.size()+candiesA.size();
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 2, 2, 2, 2};
        int[] B = {7, 4, 2, 5, 1, 2};
        System.out.println(solution(A,B));
    }
}
