import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewmalwa18@gmail.com
 * function of the glass hour problem
 * it accepts a 6x6 array then finds the largest sum by making the comparisons
 * btn all the possible sums from the array then displays the result
 * e.g for input
 * 3 5 4 3 5 6
 * 4 3 5 1 4 3
 * 5 2 3 1 4 3
 * 6 3 4 7 4 1
 * 4 3 5 6 4 2
 * 7 4 2 4 5 4
 * the function returns 32 coz  its the largest of all the possible sums of the array
 */

public class Arrays_2D {

    private static int maxSub(int[][] array) {
        int numberOfRows = array.length;
        int numberOfColumns = array[0].length;

        int rowCount=0;
        int maxSum=-100;

        for (int i = 0; i < numberOfRows-2; i++) {
            for (int k = 0; k < numberOfColumns-2; k++) {
                int sum=0;
                if(numberOfRows>rowCount) {
                    sum += getRowSum(array[rowCount], k);
                }
                if(numberOfRows>(rowCount+1)) {
                    sum += getMidRowValue(array[rowCount + 1], k);
                }
                if(numberOfRows>(rowCount+2)) {
                    sum += getRowSum(array[rowCount + 2], k);
                }else{break;}
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
            rowCount++;
        }

        return maxSum;
    }

    private static int getRowSum(int[] a, int startIndex) {
        int endI = 3;
        int size = a.length;
        int sum = 0;
        for (int j = startIndex; j < (endI + startIndex); j++) {
            if (size == j) {
                break;
            }
            sum = sum + a[j];
        }
        return sum;
    }

    private static int getMidRowValue(int[] a, int startIndex){
        return (a.length<=(startIndex+1))?0:a[startIndex+1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(maxSub(arr));

        scanner.close();
    }
}