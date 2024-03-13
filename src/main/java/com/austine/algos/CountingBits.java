package com.austine.algos;

import java.util.Arrays;
import java.util.Collections;

public class CountingBits {
    /**
     * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 2
     * Output: [0,1,1]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * Example 2:
     *
     * Input: n = 5
     * Output: [0,1,1,2,1,2]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * 3 --> 11
     * 4 --> 100
     * 5 --> 101
     * @param n
     * @return
     */

    //solution with 2 * O(n)
//    public static int[] countBits(int n) {
//        int[] arr=new int[n+1];
//        for(int i=0;i<=n;i++){
//            arr[i]=countBitsPerVal(i);
//        }
//        return arr;
//    }
//    private static int countBitsPerVal(int val){
//        String bval=Integer.toBinaryString(val);
//        int count=0;
//        for(int i=0;i<bval.length();i++){
//            if(bval.charAt(i)=='1') count++;
//        }
//        return count;
//    }
    //solution with O(n)
    public static int[] countBits(int n) {
        int[] arr=new int[n+1];
        int offset=1;
        for(int i=1;i<=n;i++){
            if(offset*2==i) offset=i;
            arr[i]=1+ arr[i-offset];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
