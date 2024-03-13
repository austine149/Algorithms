package com.austine.algos;

import java.util.Arrays;

public class ProductExceptSelf {
    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     *
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Example 2:
     *
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=1;
            arr[i]=product(nums);
            nums[i]=temp;
        }
        return arr;
    }
    static int product(int[] arr){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        return prod;
    }

    private static int[] prodExceptSelf(int[] nums){
        int n = nums.length, mult = 1;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = mult;
            mult*=nums[i];
        }
        mult = 1;
        for(int j = n-1; j>=0; j--){
            ans[j]*=mult;
            mult*=nums[j];
        }
        return ans;
    }

    static void printString(){
        String s1 = "hello";
         s1 = "he" + "llo!";
        System.out.println(s1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(prodExceptSelf(arr)));
    }
}
