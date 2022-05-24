package com.austine.algos;

import java.util.HashMap;
import java.util.Map;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 *the function accepts an integer array and the target sum that you wanna get
 * it then looks for two possible number that when added result into the target sum
 * if their are not values that can add upto the target sum that is given then
 * the function return [-1 -1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();

        for (int i=0; i<nums.length;i++) {
            int num1 = target - nums[i];
            if (map.containsKey(num1)){
                return new int[] {map.get(num1), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
    }
    public static void main (String[] args){
    TwoSum twoSum=new TwoSum();
    int[] array= {2,7,11,15};
    int[] k=twoSum.twoSum(array, 26);
        System.out.print(k[0] + " " + k[1]);
    }
}
