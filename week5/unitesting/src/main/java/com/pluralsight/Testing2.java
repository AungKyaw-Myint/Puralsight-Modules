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
        Arrays.sort(nums);

        List<List<Integer>> response = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = Math.min(i + 1, nums.length - 1);
            int right = nums.length - 1;
            while (left < right) {

                int sum = num + nums[left] + nums[right];
                if (sum == 0) {
                    response.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return response;
    }
}
