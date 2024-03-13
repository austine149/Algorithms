package com.api.openBank.algos;

public class PrintHashes {
    static void printHashes(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j>n){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHashes(6);
    }
}
