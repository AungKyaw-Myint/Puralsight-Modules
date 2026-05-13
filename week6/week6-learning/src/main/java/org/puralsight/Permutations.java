package org.puralsight;

import java.util.*;

public class Permutations {

    static void main() {
        Permutations sol = new Permutations();
        int[] nums = {-1,0,-5,-2,-2,-4,0,1,-2};
//        System.out.println(sol.permute(nums)); // [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]

        System.out.println(fourSum(nums, -9));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li=new ArrayList<>();
        if(nums==null || nums.length<4){
            return li;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1; int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        li.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right+-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return li;
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();

        if(digits.isEmpty()){
            return result;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

//        backtrack(digits, 0, "", result, map);
        return result;
    }


    private void backtrack(String digits, int index, String current, List<String> result, Map<Character,String> map) {

        if(index == digits.length()){
            result.add(current);
            return;
        }
        String letters=map.get(digits.charAt(index));
        for(char letter:letters.toCharArray()){
            backtrack(digits,index+1, current+letter, result, map);
        }
    }

    /*
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }


    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue; // Skip duplicates
            temp.add(nums[i]);
            backtrack(result, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }

     */
}
