package com.austine.algos;

import java.util.HashSet;
import java.util.Set;

public class MicrosoftQuizOne {
    /**
     * Write a function:
     *
     * class Solution {
     * 	public int solution(String S){}
     * }
     * that, given a string S consisting of N lowercase letters, returns the minimum number of
     * letters that must be deleted to obtain a word in which every letter occurs a unique number of times.
     * We only care about occurences of letters that appear at least once in a result.
     * Example:
     * Given S="aaaabbbb", the function should return 1. We can delete one occurence of a or one occurence of b.
     * Then one letter will occur four times and the other one three times.
     *
     * Given S="eeee", the function should return 0, there is no need to delete any characters.
     *
     * Given S="example", the function should return 4
     *
     * Given S="ccaaffddecee", the function should return 6. For example, we can delete all occurences of e and f and one
     * occurence of d to obtain the word "ccaadc". Note that both e and f will occur zero times in the word, but that is fine, since we only care about letters that appear at least once.
     */
    public static int solution(String S) {
        int[] freq = new int[26];
        for (char c : S.toCharArray()) {
            freq[c - 'a']++;
        }
        int deletions = 0;
        Set<Integer> usedFreqs = new HashSet<>();
        for (int f : freq) {
            while (f > 0 && usedFreqs.contains(f)) {
                f--;
                deletions++;
            }
            usedFreqs.add(f);
        }
        return deletions;
    }

    public static void main(String[] args) {
        System.out.println(solution("ccaaffddecee"));
    }
}
