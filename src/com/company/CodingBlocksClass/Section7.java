package com.company.CodingBlocksClass;

import java.util.ArrayList;

public class Section7 {


    public static ArrayList<String> boardPath(int curr,int end) {

        //base+
        if(curr == end){
            ArrayList<String> bResult = new ArrayList<>();
            bResult.add("\n");
            return bResult;
        }
        //base-
        if(curr > end){
            //we dont what the loop to run here
            ArrayList<String> bResult = new ArrayList<>();
            return bResult;
        }

        ArrayList<String> myRes = new ArrayList<>();
        //6 recursive calls as we have 6 small problems
        for(int dice=1;dice<=6;dice++){
            ArrayList<String> rr = boardPath(curr+dice,end); //got result of that level

            //adding value to myRes from rr with value to get there.
            for(String rrs:rr){
                myRes.add(rrs+dice);
            }


        }
        return myRes;


    }
}
