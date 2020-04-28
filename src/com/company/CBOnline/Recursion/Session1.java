package com.company.CBOnline.Recursion;

import java.util.*;

public class Session1 {

    public static void main(String[] args) {
        //subSeq("abc","");
       System.out.println(genPermutation("abc"));
    }

    public static void subSeq(String u, String p){
        if(u.isEmpty()){ System.out.println(p);

        //Forgot return
        return;
        }

        //Take first char and add
        char ch = u.charAt(0);
        // set p
        u = u.substring(1);

        // Call left which we add
        subSeq(u,p+ch);

        // Call right which we dont add

        subSeq(u,p);
    }

    public static ArrayList<String> genPermutation(String str){
        // Base
        if(str.length() == 0){
            // Return an "" string such that we run outer loop once
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;

        }
        //Take out first char abc - a bc
        char ch = str.charAt(0);
        String ros = str.substring(1);

        // Catch all results in arraylist
        ArrayList<String> recursionR;
        recursionR = genPermutation(ros);

        ArrayList<String> mr = new ArrayList<>();

        for(String s:recursionR){

            for(int i=0;i<=s.length();i++){
                // Cannot have s = s.substring(0,i) + ch + s.substring(i); as we are loop2 ing throgh it cannot change that.
                String val = s.substring(0,i) + ch + s.substring(i);
                mr.add(val);
            }
        }
        return mr;


    }

}
