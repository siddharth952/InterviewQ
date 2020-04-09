package com.company.CodeWars;

import java.util.Arrays;

public class CodeWars {

    public static void Jaden_Casing(String phrase){
       // "How Can Mirrors Be Real If Our Eyes Aren't Real"
        StringBuilder s= new StringBuilder("");

        phrase.split(" "); //to string array
        for (String s1:phrase.split(" ")) {
            s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
            s.append(s1);
            s.append(" ");
        }

        System.out.print(s.toString());

    }

    public static void firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int flag = 0;
        if(nums[0] == 0){
            flag = 1;
        }

        for(int i=1;i<=nums.length;i++){
            if(nums[i-1] < 0)
                continue;


            if(nums[i-1] - i != 0) { //if 0 then do not add
                System.out.print(i);
                break;
            }

        }


    }

}
