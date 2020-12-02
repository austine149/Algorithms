import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * function that returns two sums
 * one is the sum of the possible smallest values that can be added from the values passes
 * second is the sum of the possible largest values that can be added from the values passes
 */

public class MiniMaxSum_Hackerank {

    protected int x,y;
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long sum=0;
        int minValue=arr[0];
        int maxValue=arr[0];

        for(int i:arr){
            if(i<minValue){
                minValue=i;
            }
            if(i>maxValue){
                maxValue=i;
            }
            sum+=i;
        }

        System.out.print(sum-maxValue);
        System.out.print(" ");
        System.out.print(sum-minValue);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);


        MiniMaxSum_Hackerank t= new MiniMaxSum_Hackerank();
        t.x=9;
        t.y=6;
        System.out.println("\nThis are the values that am displaying from the function " + (t.x+t.y));
        scanner.close();
    }
}