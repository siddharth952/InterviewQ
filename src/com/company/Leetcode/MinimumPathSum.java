package com.company.Leetcode;

import java.util.Scanner;

public class MinimumPathSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt(); int n = in.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++){
                int temp = in.nextInt();
                arr[i][j] = temp;
            }

        System.out.println(minPathSum(arr));
    }



    public static int minPathSum(int[][] grid) {
        /*
         [
          [1,3,1],
          [1,5,1],
          [4,2,1]
        ]
         */
        

        return 1;
    }

}
