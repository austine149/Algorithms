package com.api.openBank.algos;


public class CodilityDemo {
        public static int solution(int[] A) {
            // Step 1: Find the maximum element in the array
            int max = 0;
            for (int num : A) {
                if (num > max) {
                    max = num;
                }
            }

            // Step 2: Create a boolean array to mark the presence of numbers
            boolean[] present = new boolean[max + 2]; // +2 to include 0 and handle edge cases

            // Step 3: Mark the presence of numbers in the array
            for (int num : A) {
                if (num > 0) {
                    present[num] = true;
                }
            }

            // Step 4: Find the smallest missing positive integer
            for (int i = 1; i < present.length; i++) {
                if (!present[i]) {
                    return i;
                }
            }

            return 1; // Default return value (shouldn't be reached if the input is valid)
        }

    public static void main(String[] args) {
        int array[] =new int[3];


        array[0]=1;
        array[1]=2;
        array[2]=3;
        System.out.println(solution(array));
    }
}
