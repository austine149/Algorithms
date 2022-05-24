package com.austine.algos;

import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function basically rearranges the values of a string into two
 */
public class Review {
   public void myReview(String string){
       char[] str=string.toCharArray();
       for (int k = 0; k < str.length; k += 2) {

           System.out.print(str[k]);
       }
       System.out.print(" ");

       for (int j = 1; j < str.length; j += 2) {

           System.out.print(str[j]);
       }

   }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < value; i++) {
            String mystring=input.nextLine();
            Review p = new Review();
            p.myReview(mystring);
            System.out.println();
        }
        input.close();


    }
}
