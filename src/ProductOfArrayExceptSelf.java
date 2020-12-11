import java.util.ArrayList;
import java.util.List;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function accepts an integer array then finds the product of all the array excluding the
 * index at which it is during that particular iteration
 * its runtime is O(2n) linear time which is abit optimal than the quadratic time
 * this is because we are passing through the array 2 times
 */
public class ProductOfArrayExceptSelf {
    static List productOfArratExceptSelfTwo(int[] arr){
        List list=new ArrayList();
        int product=1;
        for (int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        for (int j=0;j<arr.length;j++){
            list.add(product/arr[j]);
        }
        return list;
    }
    public static void main(String[] args){
        int[] myarray={1,2,3,4};
        System.out.println(productOfArratExceptSelfTwo(myarray));
    }
}
