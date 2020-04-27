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
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
         }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rr = genPermutation(ros);
        ArrayList<String> myResult = new ArrayList<>();

        // Adding char at i
        for(String s:rr){
            for(int i = 0;i<=s.length();i++) {
                String val = s.substring(0, i) + ch + s.substring(i);
                myResult.add(val);
            }
        }
        return myResult;
    }

}
