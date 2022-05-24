package com.austine.algos;

import java.util.HashMap;
import java.util.Map;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function that returns the first duplicate number in an array
 */
public class FirstDuplicate {
    static int firstDuplicate(int [] arr){
        int dup=0;
        Map<Integer, Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsValue(arr[i])){
                dup=arr[i];
            }
            else {
                map.put(i,arr[i]);
            }
        }
        return dup;
    }
    public static void main(String[] args){
        int[] myarray={-2,-1,-3,5,-3,2};
        System.out.println(firstDuplicate(myarray));
    }
}
