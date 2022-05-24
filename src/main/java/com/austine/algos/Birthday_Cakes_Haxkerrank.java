package com.austine.algos;

public class Birthday_Cakes_Haxkerrank {

    /**
     * written by: austine wamalwa
     * email: austinewamalwa18@gmail.com
     * the function returns the number of maximum values in the array passed
     * @param
     */

     static int birthdayCakes(int[] arr){
         int max= arr[0];
         int count=0;
      for(int i=1; i<arr.length;i++){
          if (arr[i]>max){
              max = arr[i];
          }
      }
         for (int j=0; j<arr.length;j++){
             if (arr[j] == max){
                 count++;
             }
         }
        return count;
    }
    public static void main (String[] args){

        int[] myarray ={2,5,4,1,6};
        System.out.println(birthdayCakes(myarray));
    }
}
