package com.austine.algos;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewSolution {
    /**
     * Write a  function called reverseWords that takes a sentence as input and
     * returns the sentence with the order of words reversed.
     * @param args
     *
     * Example
     * Java is awesome
     *
     * Output
     * awesome is Java
     *
     *
     * Write a function called findNthLargest that takes an array of numbers and an
     * integer n as input, and returns the nth largest element from the array
     *
     * [10, 5, 3, 8, 2];
     * n=3
     * returns 5
     */
    public static void reverseString(String string){
        String[] splitString = string.split("\\s");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=splitString.length-1;i>-1;i--){
            stringBuilder.append(splitString[i] + " ");

        }
        System.out.println(stringBuilder.toString());
    }

    public static int findNthLargest(int [] arr, int n){
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static String longestPalindromeString(String s) {
        HashMap<String, Integer> substrings = new HashMap<>();
        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j);
                if (substrings.containsKey(substring)) {
                    int length = j - i;
                    if (length > maxLength) {
                        maxLength = length;
                        longestSubstring = substring;
                    }
                } else {
                    substrings.put(substring, 1);
                }
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        reverseString("Java is awesome");
        int[] arr=new int[]{10, 5, 3, 8, 2};
        System.out.println(findNthLargest(arr, 3));
        System.out.println(longestPalindromeString("abcabdcdd"));
    }
}
