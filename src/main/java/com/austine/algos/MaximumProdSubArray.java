package com.austine.algos;

public class MaximumProdSubArray {
    /**
     * Given an integer array nums, find a
     * subarray
     * that has the largest product, and return the product.
     *
     * The test cases are generated so that the answer will fit in a 32-bit integer.
     *
     * Example 1:
     *
     * Input: nums = [2,3,-2,4]
     * Output: 6
     * Explanation: [2,3] has the largest product 6.
     * Example 2:
     *
     * Input: nums = [-2,0,-1]
     * Output: 0
     * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
     * @param nums
     * @return
     */
    public static int maxProduct(int[] nums) {
        int totalProd=1;
        int currentProd=1;
        for(int i=0;i<nums.length;i++){
            currentProd*=nums[i];
            totalProd=Math.max(totalProd, currentProd);
            if(currentProd < 0){
                currentProd=0;
            }
        }
        if(totalProd==1)return Math.min(totalProd, 0);
        return totalProd;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
//        int[] arr={-2,0,-1};
        System.out.println(maxProduct(arr));
    }
}
