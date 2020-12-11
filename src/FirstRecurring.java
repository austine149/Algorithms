import java.util.HashMap;
import java.util.Map;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function returns the first integer value that is recurring
 */
public class FirstRecurring {

    static int firstRecurring(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsValue(arr[i])){
                return arr[i];
            }
            else {
                map.put(i,arr[i]);
            }
        }
        return -1;
    }

    public static void main (String[] args){

        int[] myarray= {2,5,3,1,3,2,5};
        System.out.println(firstRecurring(myarray));
    }
}
