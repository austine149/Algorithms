package com.austine.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static int solution(String S) {
        int[] freq = new int[26];
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                break;
            }
            if (i > 0 && freq[i] == freq[i - 1]) {
                freq[i - 1]--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution("ccaaffddecee"));
    }
}
