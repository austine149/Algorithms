/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function checks whether the string that is passed is same when it is reversed
 */
public class PalindromeProblem {

   static String palindromeProblem(String string){
       char[] s=string.toCharArray();
       int j=s.length-1;
       for (int i=0;i<s.length;i++){
           if (s[i] == s[j])return "Same";
           else return "Different";
       }
       j--;
       return "Unchecked";
   }
    public static void main(String[] args){
       String mystring="anna";
        System.out.println(palindromeProblem(mystring));
    }
}
