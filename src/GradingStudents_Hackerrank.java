/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function checks whether the value that is passed +2 or +1 gives a
 * result which is a multiple of 5
 * otherwise it just prints out the number itself
 * any number below 38 is no considered so its printed the way it is
 */
public class GradingStudents_Hackerrank {
    static void grade(int n){
        if ((n+2)%5==0 && n>37){
            System.out.println(n+2);
        }
        else if((n+1)%5==0 && n>37){
            System.out.println(n+1);
        }
        else {
            System.out.println(n);
        }
    }
    public static void main(String[] args){
       grade(33);
    }
}
