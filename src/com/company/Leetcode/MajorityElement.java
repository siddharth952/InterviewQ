package com.company.Leetcode;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElements(nums));
    }

    public static int majorityElements(int[] nums) {
        if(nums.length == 1 ) return nums[0];

        int freq [] = new int[26];
        int n = nums.length;


        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }

        // For appear more than n/2
        for(int i = 0; i < 10; i ++)
            if(freq [nums[i]] > Math.floor(n/2)) {
                return nums[i];
            }

        return -1;

    }
}
