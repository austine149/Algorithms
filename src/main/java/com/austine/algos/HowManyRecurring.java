package com.austine.algos;

import java.util.HashMap;
import java.util.Map;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function returns the number of repeating values in the array
 */
public class HowManyRecurring {

    static int howManyRecurring(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(map.containsValue(arr[i])){
                count++;
            }
            else {
                map.put(i,arr[i]);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] myarray={2,4,3,1,3,2,5};
        System.out.println(howManyRecurring(myarray));

    }
}
