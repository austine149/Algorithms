/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * date: 25/11/2020
 *
 * function to print hashes
 * the hash printed in the inner loop only when the sum of j and i is greater then n
 * so when the i and j grows then the it becomes greater than n so the hashes are printed
 * as they increase downwards
 */
public class printHashes_Hackerrank {
    static void printHashes(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j>n){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printHashes(6);
    }
}
