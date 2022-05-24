package com.austine.algos;

import java.util.HashMap;
import java.util.Map;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function looks for a pair of numbers within the array then returns their count
 * remember odd numbers can not give pairs so that is the problem that the code
 * also solves
 */
public class sockMerchant_Hackerrank {
    static int sockMerchant(int[] ar) {
        int finalCount=0;
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<ar.length;i++) {
            int count = 1;
            if (map.containsValue(ar[i])) {
                continue;
            } else {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                    }
                }
                map.put(i,ar[i]);
            }
            finalCount+=count/2;
        }
    return finalCount;
    }
public static void main (String[] args){
//    int[] myarray={10,20,20,10,10,30,50,10,20};
    int[] myarray={2,5,3,2,3,6,3,2,2};
    System.out.println(sockMerchant(myarray));
}
}
