package com.austine.algos;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    private static int[] selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int index=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<min){
                    min=arr[j];
                    index=j;
                    swap(arr, i, index);
                }
            }
        }
        return arr;
    }
    static void swap (int[] ar, int a, int b){
        int temp= ar[a];
        ar[a]=ar[b];
        ar[b]=temp;

    }
    public static void main(String[] args) {
        int[] arr=new int [10];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
