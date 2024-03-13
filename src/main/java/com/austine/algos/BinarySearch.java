package com.api.openBank.algos;

public class BinarySearch {
    private static int binarySearch(int[] arr, int numberToSearch) {
        int low=0, high=arr.length-1;

        while(low <= high){
            int middlePosition=(low+high)/2;
            int middleNumber=arr[middlePosition];
            if (numberToSearch == middleNumber) return middlePosition;
            if (numberToSearch < middleNumber) high=middlePosition-1;
                low=middlePosition+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7, 9, 11};
        System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearch(arr, 8));
    }

}
