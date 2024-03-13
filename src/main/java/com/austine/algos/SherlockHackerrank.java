package com.austine.algos;

public class SherlockHackerrank {
    /**
     * Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
     *
     * Note: A square integer is an integer which is the square of an integer, e.g. 1,4,9,16
     *
     * Example
     * a=24
     * b=49
     * There are three square integers in the range: 25, 36 and 49 Return 3
     *
     * Function Description
     *
     * Complete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  to .
     *
     * squares has the following parameter(s):
     *
     * int a: the lower range boundary
     * int b: the upper range boundary
     * Returns
     *
     * int: the number of square integers in the range
     * Input Format
     *
     * The first line contains , the number of test cases.
     * Each of the next  lines contains two space-separated integers,  and , the starting and ending integers in the ranges.
     *
     * Constraints
     *
     *
     *
     * Sample Input
     *
     * 2
     * 3 9
     */
    public static int squares(int a, int b) {
        int count=0;
        int sq=(int) Math.sqrt(a);
        int val=sq*sq;
        if(val<a)
        {
            sq++;
            a=sq*sq;
        }
        while(a>=a && a<=b)
        {
            count++;
            sq++;
            a=sq*sq;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(squares(17, 24));
        System.out.println(squares(3, 9));
    }
}
