import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * function that is basically displaying how to use operators in java
 */

public class Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double z= meal_cost+(double) tip_percent/100*meal_cost+(double) tax_percent/100*meal_cost;
        System.out.println(Math.round(z));

    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();

    }
}
