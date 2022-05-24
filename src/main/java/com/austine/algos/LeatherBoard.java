package com.austine.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeatherBoard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result=new ArrayList<>();
        int numberOfPositions=0;
        int count=1;
        for(int i=1;i<ranked.size()-1;i++){
            if(ranked.get(i)==ranked.get(i+1)){
                continue;
            }
            else {
                count++;
            }
        }
        int x=1;
        for (int i=0; i<=player.size();i++){
            for (int j=0; j<=ranked.size();j++) {
                if (player.get(i) >= ranked.get(j)) {
                    result.add(count - (ranked.size() - j));
                }
                else {
                    result.add(count+1);
                }
            }
        }
        System.out.println(count);
return result;
    }
    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(Arrays.asList(100,100,50,40,40,20,10), Arrays.asList(5,25,50,120)));
    }
}
