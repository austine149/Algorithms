package com.api.openBank.algos;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     * Output: false
     * @param args
     */
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        map.put(nums[0], 0);
        for (int i=1;i<nums.length;i++){
            if (map.containsKey(nums[i])) return true;
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
//        int [] arr={1,2,3,1};
        int [] arr={1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}