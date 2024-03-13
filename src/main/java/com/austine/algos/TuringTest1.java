package com.austine.algos;

public class TuringTest1 {
    /**
     * A string s can have a consecutive repeated letters. Your job is to remove the least number of letters to make the number of consecutive repeated letters less than four.
     * Return the string.
     * The answer will always be unique.
     * Example:
     * input s=tuuuuuriiiiiing
     * output: tuuuriiing
     *
     * @param s
     * @return
     */
    public static String customRemoveConsecutive(String s){
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count <= 3) {
                    result.append(s.charAt(i));
                }
            } else {
                count = 1;
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(customRemoveConsecutive("tuuuuuriiiiiing"));
//        int result = -5 % 3;
//        System.out.println(result);
    }
}
