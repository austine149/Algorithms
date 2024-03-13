package com.api.openBank.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TuringExampleSolution {
    /**
     * You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future
     * rounds' scores.
     * At the beginning of the game, you start with an empty record. You are given a list of strings ops , where ops[i] is the ith operation you must apply to the
     * record and is one of the following:
     * 0. An integer x - Record a new score of x .
     * 0. "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
     * 0. "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
     * 0. "c" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
     * Return the sum of all the scores on the record.
     *
     * Example 1:
     *
     * Input: ops = ["5","2","C","D","+"]
     * Output: 30
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "2" - Add 2 to the record, record is now [5, 2].
     * "C" - Invalidate and remove the previous score, record is now [5].
     * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
     * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
     * The total sum is 5 + 10 + 15 = 30.
     *
     * Example 2:
     *
     * Input: ops = ["5","-2", "4", "C", "D","9", "+"]
     * Output: 27
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "-2" - Add -2 to the record, record is now [5, -2].
     * "4" - Add 4 to the record, record is now [5, -2, 4].
     * "C" - Invalidate and remove the previous score, record is now [5, -2].
     * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
     * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
     * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
     * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
     * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
     *
     * Example 3:
     *
     * Input: ops = ["1"]
     * Output: 1
     *
     * Constraints:
     * 1 <= ops. length <= 1000
     * . ops[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
     * . For operation "+" , there will always be at least two previous scores on the record.
     * . For operations "c" and "D", there will always be at least one previous score on the record.
     * @param ops
     * @return
     */

        public static int calPoints(String[] ops) {
            int result = 0;
            //check from the beginning of the array, if we have a number, create a new array and add that number.
            //based on the operations, manipulate the new list created accordingly
            List<Integer> list=new ArrayList<>();
             for (String s:ops) {

                try {
                    int val=Integer.parseInt(s);
                    list.add(val);
                }
                catch (NumberFormatException e){

                }
                if (s.equalsIgnoreCase("c")){
                    list.remove(list.size()-1);
                }
                else if (s.equalsIgnoreCase("d")){
                    list.add(list.get(list.size()-1)*2);
                }
                else if (s.equalsIgnoreCase("+")){
                    list.add((list.get(list.size()-2)) + (list.get(list.size()-1)));
                }
            }
            for (int i: list) {
                result+=i;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2", "4", "C", "D","9", "+","+"}));
    }
}
