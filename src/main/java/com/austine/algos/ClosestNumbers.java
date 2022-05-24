package com.austine.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void closestNumbers(List<Integer> numbers) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = numbers.size();
        Collections.sort(numbers);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            minDiff = Math.min(minDiff, Math.abs(numbers.get(i) - numbers.get(i + 1)));
        for (int i = 0; i < n - 1; i++) {
            ArrayList<Integer> pair = new ArrayList<Integer>();
            if (Math.abs(numbers.get(i) - numbers.get(i + 1)) == minDiff) {
                pair.add(Math.min(numbers.get(i), numbers.get(i + 1)));
                pair.add(Math.max(numbers.get(i), numbers.get(i + 1)));
                ans.add(pair);
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(5,-9,-5,9,10,12);;
        closestNumbers(list);
    }
}
