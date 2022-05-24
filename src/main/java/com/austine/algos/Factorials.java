package com.austine.algos;

import java.math.BigInteger;

public class Factorials {
    private static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result=new BigInteger(String.valueOf(n));
        for(int i=n;i>1;i--){
            result= result.multiply(new BigInteger(String.valueOf(i)).subtract(new BigInteger(String.valueOf(1))));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
extraLongFactorials(25);
    }
}
