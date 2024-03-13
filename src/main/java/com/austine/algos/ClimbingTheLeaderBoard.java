package com.austine.algos;


import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ClimbingTheLeaderBoard {
//    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//        // Write your code here
//        List<Integer> result = new ArrayList<>();
//        Set<Integer> sortedRanks=new HashSet<>(ranked);
//        ranked=new ArrayList<>(sortedRanks);
//        Collections.sort(ranked);
//        Collections.reverse(ranked);
//
//        for (int i=player.size()-1; i>=0;i--){
//            for (int j=0;j<ranked.size();j++){
//                if (player.get(i) > ranked.get(j)){
//                    result.add(j+1);
//                    break;
//                }
//                else {
//                    if (player.get(i)<ranked.get(j)){
//                        continue;
//                    }
//                    else {
//                        result.add(j+1);
//                        break;
//                    }
//                }
//            }
//        }
//        if (player.get(0) < ranked.get(ranked.size()-1)) result.add(ranked.size()+1);
//        Collections.reverse(result);
//        return result;
//    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Set<Integer> sortedRanks=new HashSet<>(ranked);
        ranked=new ArrayList<>(sortedRanks);
        Collections.sort(ranked);
        Collections.reverse(ranked);


        int temp=0;
        for (int i=0; i<player.size();i++){
            int j=ranked.size()-1-i;

           if (player.get(i)>ranked.get(j)){
               temp=i;
               continue;
           }
           else {
               result.add(ranked.size()-j);
           }
        i=temp;
        }
        if (player.get(0) < ranked.get(ranked.size()-1)) result.add(ranked.size()+1);
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(Arrays.asList(100, 100, 50, 40, 40, 20, 10), Arrays.asList(5, 25, 50, 120)));
    }

}
