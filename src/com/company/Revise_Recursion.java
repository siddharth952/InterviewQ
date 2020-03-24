package com.company;

import java.util.ArrayList;

public class Revise_Recursion {

    public static void main(String[] args) {
        // write your code here

       ArrayList<String> res =  mazePath(0,0,1,2,2);

        System.out.println(res);
    }


    public static ArrayList<String> mazePath(int cr, int cc, int er, int ec,int BOARDDIMESTIONS){
        //base_pos
        if(cr == er && cc == ec){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;

        }else if(cr > BOARDDIMESTIONS || cc > BOARDDIMESTIONS){
            //Out of Bounds
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }


            //base_neg


            //loops to add element ot master if found will receive from all calls
            ArrayList<String> master = new ArrayList<>();
        //recursionResult for Vertical call
        ArrayList<String> rRH = mazePath(cr,cc+1,er,ec,BOARDDIMESTIONS);
        //loop1
        for(String rRHS:rRH){
            //For Each String in ArrayList
            master.add("H"+rRHS);
        }

        //recursionResult for Vertical call
        ArrayList<String> rRV = mazePath(cr+1,cc,er,ec,BOARDDIMESTIONS);
        //loop2
        for(String rRVS:rRV){
            //For Each String in ArrayList
            master.add("V"+rRVS);
        }

        




    return master;
    }
}
