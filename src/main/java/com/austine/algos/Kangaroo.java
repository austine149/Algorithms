package com.austine.algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        //check for the velocities of the movements;

//        List<Integer> list=new ArrayList<>();
//        list.add(x1);
//        list.add(v1);
//        list.add(x2);
//        list.add(v2);
//        int max= Collections.max(list);
//        if (x1==0)x1=1;
//
//        boolean isFound=true;
//        while(isFound){
////            isFound=false;
//                if (max % x1 == 0 && max % v1 == 0 && max % x2 == 0 && max % v2 == 0) {
//                    isFound = true;
//                    return "YES";
//                }
//                max++;
//        }
//        return "NO";
        while(x1 <= x2){
            if(x1 == x2){
                return "YES";
            }
            x1 += v1; x2 += v2;
        } return "NO";
    }

    public static void main(String[] args) {
//        0 2 5 3
//        System.out.println(kangaroo(0, 2, 5, 3));
        System.out.println(kangaroo(0, 3, 4, 2));
    }
}
