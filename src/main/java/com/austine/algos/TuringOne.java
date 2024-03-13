package com.api.openBank.algos;

public class TuringOne {
    /**
     * When given a matrix with height equal to its width k return the sum of all the elements found int the first and second lines of the matrix
     *
     * The sum should include all elements found in the first, and all elements that are exclusively in the second diagonal
     *
     * Example
     * K=[
     * [2 3 4],
     * [5 6 7],
     * [8 9 10]
     * Output =30
     * Explanation 2+6+10+4+8=30
     * @param
     */

    static int sumOfMatrix(int[][] k){
        int n = k.length;
        int sum = 0;

        // First diagonal sum
        for (int i = 0; i < n; i++) {
            sum += k[i][i];
        }

        // Second diagonal sum (excluding center)
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (i != n / 2) {  // Skip center element for odd-sized matrices
                sum += k[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
         int[][] k={{2,3,4},{5,6,7},{8,9,10}};
        System.out.println(sumOfMatrix(k));
    }
}
