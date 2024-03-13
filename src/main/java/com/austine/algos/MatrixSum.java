package com.austine.algos;

public class MatrixSum {
    /**
     * When given a matrix wuth height equal to its width k rerurn the sum of all the elements found int the first and second lines of the matrix
     *
     * The sum should include all elements found in the first, and all elements that are exclusively in the second diagonal
     *
     * Example
     * K=[[2 3 4],
     *    [5 6 7],
     *    [8 9 10]
     * Output =30
     * Explanation 2+6+10+4+8=30
     * @param matrix
     * @return
     */
    static int mainDiagonal = 0;
    static int minorDiagonal = 0;
    public static int sumFirstAndSecondDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                // Check for main diagonal element.
                if (i == j) {
                    sum += a[i][j];
                }

                // Check for secondary diagonal element.
                if (i + j == a.length - 1) {
                    if (i==1 && j==1) break;
                    sum += a[i][j];
                }
            }
        return sum;
    }

    public static void printValuesOfAnArray(int[][] k){
        for (int i=0;i<k.length;i++){
            for (int j=0; j<k[i].length;j++){
                System.out.print(k[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] K = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        int output = sumFirstAndSecondDiagonal(K);
        System.out.println(output);
//        printValuesOfAnArray(K);

    }
}
