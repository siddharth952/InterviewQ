package com.company.Leetcode;

import java.util.ArrayList;

public class RunLengthEncode {

        public int[] decompressRLElist(int[] nums) {
            // list of nums ie compressed
            // [freq,val] = [nums[2*i] , nums[s*i+1]]
            // each pair freq elements with value val concat in sublist left -> right
            ArrayList<Integer> myAns = new ArrayList();

            for(int i=0;i<nums.length-1;i+=2){
                int freq = nums[i];
                int val = nums[i+1];
                while(freq != 0){
                    myAns.add(val);
                    freq--;
                }
            }
            return myAns.stream().mapToInt(i -> i).toArray();

            // Had to change ArrayList<Integer> to an int[] by using  myAns.stream().mapToInt(i -> i).toArray();
            // And had to change to nums.length -1

        }

}
