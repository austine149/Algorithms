package com.austine.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderBoard {
    private static int numberOfPositions(List<Integer> list){
        int totalPositions=1;
        int pos=list.get(0);
        for (int i=1; i<list.size();i++){
            if (list.get(i)<pos){
                totalPositions++;
            }
        }
        return totalPositions;
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result=new ArrayList<>();
        List<Integer> myList=new ArrayList<>();
        int positions=numberOfPositions(ranked);
        System.out.println(positions);
        for (int i=0;i<player.size();i++){
            if (player.get(i)>ranked.get(0))result.add(1);

            if (player.get(i) <ranked.get(ranked.size()-1))result.add(ranked.size()-1);
            for (int j=0;j<ranked.size();j++){
                myList.add(ranked.get(j));
                if (player.get(i)>=ranked.get(j)){
                    int myPos=numberOfPositions(myList);
                    if (myPos>0) {
                        result.add(myPos);
                        break;
                    }
                }
            }
            myList=new ArrayList<>();
        }

        return result;
    }
    public static void main(String[] args) {
        List<Integer> rankedList= Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> playerList= Arrays.asList(5,25,50,120);
        System.out.println(climbingLeaderboard(rankedList, playerList));
    }
}
