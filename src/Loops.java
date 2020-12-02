import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * function that prints the mathematical table of row length 10
 * it accepts an integer of which it will multiply with the values of i
 * running in the for loop to the maximum of 10 row length
 */
public class Loops {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i=0;i<11;i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
