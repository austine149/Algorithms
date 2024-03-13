package com.api.openBank.algos;

import java.util.ArrayList;
import java.util.List;

public class Gig {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
            list.remove((Integer) (i - 1));
        }
        System.out.println(list.size());
    }

}
