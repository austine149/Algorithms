import java.util.ArrayList;
import java.util.List;

/**
 * written by: austine wamalwa
 * email: austinewamalwa18@gmail.com
 * this is the sliding window technique
 * the function accepts an integer array and the sum that you wanna check
 * for, the function then finds the longest subarray that when added results
 * into the sum
 * the function then returns the position of the starting point in the array
 * and the ending point such that when you add then elements within the
 * found limits then it results into the sum
 */
public class FindLongestSubarrayBySum {
    static List findLongestSubarrayBySumTwo(int sum, int[] arr){
        List list=new ArrayList();
        int currentSum=0;
        int left=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum>sum){
                currentSum-=arr[left++];
                if(currentSum == sum && i-left>count){
                    list.add(left+1);
                    list.add(i+1);
                }
                currentSum=arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] myarray={1,2,3,0,0,0,7,5};
        System.out.println(findLongestSubarrayBySumTwo(12,myarray));
    }
}
