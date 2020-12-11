import java.util.ArrayList;
import java.util.List;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * function that returns the maximum subarray sum and the values that are being added
 * it adds elements at every move then checks for the highest of the possible maximum
 * sums that it generates as it iterates
 * this is the basic implementation of the Kadane's algorithm of dynamic programming
 */

public class LargestSubstringSum {
    static List largestSubstringSum(int[] arr){
        List list=new ArrayList();
        int maxSum=arr[0];
        int currentSum=maxSum;
        for(int i=0;i<arr.length;i++){
            int left=0;
            currentSum+=arr[i];
            if(arr[i]>currentSum) currentSum-=arr[left++];
            if(currentSum>maxSum){
                maxSum=currentSum;
                list.add(arr[i]);
            }

        }
        list.add(maxSum);
        return list;
    }
     public static void  main(String[] args){
    int[] myarray={-2,2,4,3,5,-11,6};

//         -2,2,5,-11,6
         System.out.println(largestSubstringSum(myarray));
    }
}
