package com.api.openBank.algos;

public class Mystery {
    public static int mystery(int x, int y) {
        if (y == 0) return 0;
        if (y % 2 == 0) return mystery(x + x, y / 2);
        return mystery(x + x, y / 2) + x;
    }

    public static void main(String[] args) {

        System.out.println(mystery(11, 6));
    }
}
