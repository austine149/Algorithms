package com.austine.algos;

import java.util.ArrayList;
import java.util.List;

public class CloudsHackerrank {
    static int jumpingOnClouds(int[] c, int k) {
        int maxEnergy=100;
        int cloud0=c[0];
        for(int i=0; i<c.length;i+=k){
            if(c[i]>0){
                maxEnergy=maxEnergy-3;
            }
            else{
                maxEnergy=maxEnergy-1;
            }
        }
        return maxEnergy;
    }

    public static void main(String[] args) {
//        int [] c={0,0,1,0,0,1,1,0};
        int[] c={1,1,1,0,1,1,0,0,0,0};
        List<Integer> list=new ArrayList<>();
        System.out.println(jumpingOnClouds(c, 1));
    }
}
