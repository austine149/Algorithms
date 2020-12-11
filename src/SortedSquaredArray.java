import java.util.Arrays;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * the function returns the sorted array of the input array that is passed
 * the Math.absolute methods kinda removes the negative sign and then compares the
 * absolute value of the number
 */
public class SortedSquaredArray {

    static int[] sortedSquaredArray(int[] arr){
        int[] result= new int[arr.length];
        int left=0;
        int right=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(arr[left]) > arr[right]){
                result[i] = arr[left] * arr[left];
                left++;
            }
            else{
                result[i] = arr[right] * arr[right];
                right--;
            }
        }

        return result;
    }
    public static void main (String[] args){

        int[] myarray={ -6,-4,1,2,3,5};
        System.out.println(Arrays.toString(sortedSquaredArray(myarray)));
    }
}
