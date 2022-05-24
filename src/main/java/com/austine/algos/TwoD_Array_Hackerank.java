package com.austine.algos;

public class TwoD_Array_Hackerank {
    /**
     * written by: austine wamalwa
     * Email: austinewamalwa18@gmail.com
     * Date: 22/11/2020
     * this is a function that accepts a 2D integer array
     * the function then calculates the difference between the main diagonal and the minor
     * diagonal to the console
     * @param args
     */
    static int mainDiagonal = 0;
    static int minorDiagonal = 0;
    static void mainDiagonal(int[][] arr){

        for(int i=0; i<arr.length;i++) {
            for(int j=i; j<arr.length-1;j++){
                mainDiagonal+=arr[i][j+1];
            }

        }
        minorDiagonal(arr);
    }
    static void minorDiagonal(int[][] arr){
       for (int i=arr.length-1;i>0;i--){
           for (int j=i;j>0;j--){
               minorDiagonal +=arr[i][i];
           }
       }
        System.out.println(mainDiagonal-minorDiagonal);
    }


    public static void main(String[] args){

        int[][] array = new int[3][3];
        array[0][0] =4;
        array[0][1] =2;
        array[0][2] =3;
        array[1][0] =5;
        array[1][1] =3;
        array[1][2] =7;
        array[2][0] =2;
        array[2][1] =6;
        array[2][2] =1;

 mainDiagonal(array);


    }
}
