package com.api.openBank.algos;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirdV3(List<Integer> arr){
        Map<Integer, Integer> cache = new HashMap<>();
        arr.forEach(el -> cache.merge(el, 1, Integer::sum));

        int max = 0;
        int maxBirdId = 0;
        for (int i = 5; i >= 1; i--) {
            if (cache.containsKey(i) && cache.get(i) >= max) {
                max = cache.get(i);
                maxBirdId = i;
            }
        }
        return maxBirdId;
    }
    public static int migratoryBirdsV2(List<Integer> arr) {
       int min=Collections.min(arr);
       int max=Collections.max(arr);
       Map<Integer, Integer> recordMap=new HashMap<>();
       for (int i=min;i<max;i++){
           recordMap.put(i, 0);
       }
       for (int i=0; i<=arr.size()-1; i++){
          if (recordMap.containsKey(arr.get(i))){
              int mapVal=recordMap.get(arr.get(i));
              recordMap.replace(arr.get(i), mapVal+1);

          }

       }
        recordMap.values().removeIf(val -> val<Collections.max(recordMap.values()));
       return Collections.min(recordMap.keySet());
    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Set<Integer> list=new HashSet<>();
        int count=0;
        for(int i=0; i<arr.size(); i++){
            int smallCount=1;
            for (int j=i;j<arr.size()-1;j++){
                if (arr.get(i).equals(arr.get(j+1)))smallCount++;
            }
            if (smallCount>count) {
                count=smallCount;
                list=new HashSet<>();
                list.add(arr.get(i));
            }

        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
//        System.out.println(migratoryBirdsV2(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));
//        System.out.println(migratoryBirdsV2(Arrays.asList(1,4,4,5,3)));
        System.out.println(migratoryBirdV3(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));
    }
}
