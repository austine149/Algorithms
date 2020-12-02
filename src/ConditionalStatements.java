import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamlwa18@gmail.com
 * function to demonstrate basic java nothing fancy here
 */
public class ConditionalStatements {

    public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
            int k;
            double j;
            String l;
        k=scan.nextInt();
        j=scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        l=scan.nextLine();

        System.out.println(i+k);
        System.out.println(d+j);
        System.out.println(s+l);
        scan.close();
    }
}

