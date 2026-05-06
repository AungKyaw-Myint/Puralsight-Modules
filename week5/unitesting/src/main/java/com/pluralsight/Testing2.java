package com.pluralsight;

import java.util.*;

public class Testing2 {

    static void main() {

//        Pizza pizza=new Pizza(10,"Cheese Pizza");
//        System.out.println(pizza.calculatePrice(true,false));

        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int tempI=nums[i];
                int tempJ=nums[j];
                if(tempI != tempJ && tempJ!=tempI+tempJ && tempI!= tempI+tempJ && set.contains(tempI+tempJ)){
                    List<Integer> list= new ArrayList<>();
                    list.add(tempI);
                    list.add(tempJ);
                    list.add(tempI+tempJ);

                    Collections.sort(list);
                    result.add(list);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
