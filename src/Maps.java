import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * function that uses a map to store the names and respective phone numbers of individuals
 * the function then allows you to check the phone number by use of the name as the key
 * if the name is present in the map then the function returns the phone corresponding
 * phone number
 * if the name dosent exist then the function is going to print NOT FOUND
 * which meens you will be trying to find what you have not saved
 */
public class Maps {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map=new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (map.containsKey(s)){
                System.out.println(s + "=" + map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

//factorial of a number
//         if (n == 0)
//                 return 1;
//
//                 return n*factorial(n-1);