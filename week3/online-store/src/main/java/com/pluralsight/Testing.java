package com.pluralsight;

import com.pluralsight.model.Product;

import java.util.Arrays;
import java.util.HashMap;

public class Testing {


    static void main() {

        String s="aaa";
        String p="a*a";
        int[] num1= {1,8,6,2,5,4,8,3,7};
        int[] num2= {4,6,9};

//        System.out.println(findMedianSortedArrays(num1,num2));
//        System.out.println(isMatch(s,p));

//        System.out.println(maxArea(num1));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");

        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");

        String result="";
        int temp = num;
        int pow=0;

        while (temp>0){
            int count=temp%10;
            temp= temp/10;
            int power=(int)Math.pow(10,pow);
            if(count==4 || count==9){
                result= pow == 0 ? map.get(count) + result :map.get(count*power) + result;
            }else{
                while (count>0){
                    if(map.containsKey(count*power)){
                        result=map.get(count*power)+result;
                        count=0;
                    }else {
                        result=map.get(1*power)+result;
                    }
                    count--;
                }
            }
            pow++;
        }

        return result;
    }

    public static int maxArea(int[] height) {

        int result=0;
        int left=0, right =height.length-1;

        while (left<right){
            int temp= (right-left) * Math.min(height[left], height[right]);
            result= Math.max(temp, result);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }
    public static boolean isMatch(String s, String p) {

        return isMatchRecursion(s,p,0,0);
    }

    public static boolean isMatchRecursion(String s, String p, int counter1, int counter2) {
        if(counter1 == s.length() && counter2>=p.length()) return true;
        if(counter2 == p.length()) return false;
        if(counter1 == s.length() && counter2 < p.length()) return false;

        if(counter2+1 < p.length()) {
            if (p.charAt(counter2 + 1) == '*') {

                while (counter1<s.length() && (s.charAt(counter1) == p.charAt(counter2))){
                    counter1++;
                }


                return isMatchRecursion(s, p, counter1, counter2+2);
            }
        }
        if(s.charAt(counter1) == p.charAt(counter2) || p.charAt(counter2)=='.')
            return isMatchRecursion(s, p, ++counter1, ++counter2);


        return false;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length+nums2.length];
        int counter1=0;
        int counter2=0;

        for(int i=0; i< temp.length; i++){
            if(nums1.length== counter1){

                temp[i]=nums2[counter2];
                counter2++;
                continue;
            }
            if(nums2.length == counter2){
                temp[i]=nums1[counter1];
                counter1++;
                continue;
            }
            temp[i] = nums1[counter1] >= nums2[counter2] ? nums2[counter2++] : nums1[counter1++];

        }
        int half=(temp.length-1) /2 ;
        return temp.length%2 == 0 ? (temp[half]+ temp[half+1])/2.0 : temp[half];
    }

    public static int myAtoi(String s){

        int index= 0, total= 0, sign=1;
        if(s.length() == 0) return 0;
        while (index < s.length() && s.charAt(index) == ' ') index++;

        if(index == s.length()) return 0;

        if(s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = s.charAt(index) == '+' ? 1: -1;
            index++;
        }

        while (index< s.length()){
            int digit = s.charAt(index)-'0';
            if(digit <0 || digit>9) break;

            if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit)
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total*10 + digit;
            index++;
        }
        return total * sign;
        /*
        char[] chars = s.toCharArray();
        String result= "";
        boolean initialFlag= true;
        boolean negativeFlag= false;

        for(int i=0; i < s.length(); i++){
            try {
                if(initialFlag && (chars[i]==' ' || chars[i] == '-')){
                    if(chars[i] == '-') negativeFlag=true;
                    continue;
                }
                if(Integer.parseInt(String.valueOf(chars[i]))>=0 &&  Integer.parseInt(String.valueOf(chars[i]))<=9){

                    int temp=Integer.parseInt(String.valueOf(chars[i+1]));
                    result+=String.valueOf(chars[i]);

                    initialFlag=false;

                }
            }catch (Exception e){
                break;
            }
        }

        if(result == "") return 0;
        return negativeFlag ? Integer.parseInt(result)*(-1) :Integer.parseInt(result);

         */
    }
}
