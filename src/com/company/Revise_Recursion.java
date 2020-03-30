package com.company;

import java.util.ArrayList;

public class Revise_Recursion {

    public static void main(String[] args) {
        // write your code here

//       ArrayList<String> res =  mazePath(0,0,1,2,2);
//
//        System.out.println(res);
//
//

        ques2_A(5, 1, 1);

    }


    public static ArrayList<String> mazePath(int cr, int cc, int er, int ec, int BOARDDIMESTIONS) {
        //base_pos
        if (cr == er && cc == ec) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
            //base_neg
        } else if (cr > BOARDDIMESTIONS || cc > BOARDDIMESTIONS) {
            //Out of Bounds
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }


        //loops to add element ot master if found will receive from all calls
        ArrayList<String> master = new ArrayList<>();
        //recursionResult for Vertical call
        ArrayList<String> rRH = mazePath(cr, cc + 1, er, ec, BOARDDIMESTIONS);
        //loop1
        for (String rRHS : rRH) {
            //For Each String in ArrayList
            master.add("H" + rRHS);
        }

        //recursionResult for Vertical call
        ArrayList<String> rRV = mazePath(cr + 1, cc, er, ec, BOARDDIMESTIONS);
        //loop2
        for (String rRVS : rRV) {
            //For Each String in ArrayList
            master.add("V" + rRVS);
        }

        ArrayList<String> rRD = mazePath(cr + 1, cc + 1, er, ec, BOARDDIMESTIONS);
        //loop1
        for (String rRDS : rRD) {
            //For Each String in ArrayList
            master.add("D" + rRDS);
        }
        return master;
    }

    public static void eggDrop() {
        /*
        You are given K eggs, and you have access to a building with N floors from 1 to N.

        Each egg is identical in function, and if an egg breaks, you cannot drop it again.

        You know that there exists a floor F with 0 <= F <= N such that any egg dropped at a floor higher than F will break, and any egg dropped at or below floor F will not break.

        Each move, you may take an egg (if you have an unbroken one) and drop it from any floor X (with 1 <= X <= N).

        Your goal is to know with certainty what the value of F is.

        What is the minimum number of moves that you need to know with certainty what F is, regardless of the initial value of F?
         */


    }

    public static void ques1_A(int N, int end) {
        /*
        Take as input N, a number. Print odd numbers in decreasing sequence
        (up until 0) and even numbers in increasing sequence (up until N).
        E.g. for N = 6 print 5, 3, 1, 2, 4.
         */
        if (N <= 0) {
            return;
        }
        System.out.print(N + ",");
        ques1_A(N - 2, end);
        if (N != end)
            System.out.print(N + 1 + ",");
    }

    public static void ques2_A(int N, int curr, int parent) {
        /*
        Take as input N, a number. Print the following pattern (for N = 5)
                    *
                    **
                    ***
                    ****
                    *****
         */
        if (curr == 0) {
            return;
        }
        if (curr > N) {
            return;
        }
        ques2_A(N, curr - 1, parent);
        System.out.print("* ");

        if (curr == parent) {
            System.out.print("\n");
            ques2_A(N, curr + 1, parent + 1);
        }
    }

    public static void ques3_A(int N, int curr, int parent) {
        /*
        Take as input N, a number. Print the following pattern (for N = 5)
                *****
                ****
                ***
                **
                *
         */
        if (curr == 0) {
            return;
        }
        if (curr > N) {
            return;
        }
        ques3_A(N, curr - 1, parent);
        System.out.print("* ");

        if (curr == parent) {
            System.out.print("\n");
            ques3_A(N, curr + 1, parent + 1);
        }

    }
}