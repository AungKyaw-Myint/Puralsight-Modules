package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    static void main() {

        System.out.println(reverse(1534236469));

    }

    static int reverse(int x){

        if(x >= Integer.MIN_VALUE && x<=Integer.MIN_VALUE){
            return 0;
        }
        //1056389759
        //1534236469

        long result=0;
        int temp = Math.abs(x);

        while (temp>0){

            result = (result * 10) + temp%10;

            temp=temp/10;
            if(result > Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;

        }

        return (int)result;
    }
}
