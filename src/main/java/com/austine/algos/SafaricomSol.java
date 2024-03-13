package com.austine.algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SafaricomSol {
    /**
     * A string S consisting of the letters A, B, C and D is given. The
     * string can be transformed either by removing a letter A
     * together with an adjacent letter B, or by removing a letter C
     * together with an adjacent letter D.
     *
     * Write a function:
     *
     * class Solution { public String
     * solution(String S); }
     *
     * that, given a string S consisting of N characters, returns any
     * string that:
     *
     * a. can be obtained from S by repeatedly applying
     * the described transformation, and
     * b. cannot be further transformed.
     *
     * If at some point there is more than one possible way to
     * transform the string, any of the valid transformations may be
     * chosen.
     * Examples:
     * 1. Given S = "CBACD", the function may return "C", because one of the possible sequences of operations is as follows:
     * CBACD
     * CBA
     * C
     * 2. Given S = "CABABD" the function may return an empty string, because one possible sequence of operations is:
     * CABABD
     * CABD
     * CD
     * 3. Given string S = "ACBDACBD" the function should return "ACBDACBD", because no operation can be applied to string S. Write an efficient algorithm for the above
     * @param S
     * @return
     */
    public static String solution(String S) {
        // Implement your solution here
        String newString = "";
        newString = S.replace("AB", "");
        newString = newString.replace("BA", "");
        newString = newString.replace("CD", "");
        newString = newString.replace("DC", "");
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(solution("CABABD"));
    }
}
