package com.austine.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutSticks {
    static List<Integer> doSubtraction(List<Integer> list, int minValue){
        List<Integer> mylist=new ArrayList<>();
        for (int i: list) {
            int val=i-minValue;
            if (val!=0){
                mylist.add(val);
            }
        }
        return mylist;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result=new ArrayList<>();
         result.add(arr.size());
        for(int i=0; i<=arr.size();i++){
            int min=1001;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j) <min){
                    min=arr.get(j);
                }
            }
            arr= doSubtraction(arr, min);
            if (arr.size() !=0)
                result.add(arr.size());
                i=0;
        }
        return result;
    }
    public static void main(String[] args) {

//        5, 4, 4, 2, 2, 8
        List<Integer> list = Arrays.asList(1,13,3,8,14,9,4,4);
        System.out.println(cutTheSticks(list));
    }
}
