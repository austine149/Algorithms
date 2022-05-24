package com.austine.algos;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static List<Integer> permutationEquation(List<Integer> p) {
    List<Integer> result=new ArrayList<>();
        for(int i=0; i<=p.size();i++){
        if(p.contains(i)){
            for(int j=0; j<=p.size();j++){
                if(p.get(j) == i){
                    for (int x=0;x<=p.size();x++){
                        if (p.get(x) == j+1){
                            result.add(x+1);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
        return result;
}


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
//        4 3 5 1 2
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(permutationEquation(list));
    }

}
