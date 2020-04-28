package com.company.CodeForces;

import java.util.Scanner;

public class BeautifulMatrix {

    /*
    1 2 3 4 5
    0 0 0 0 0
    0 0 0 0 1
    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 0

    -----------
    3
     */

    /*
    Swap two neighboring matrix rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < 5).
    Swap two neighboring matrix columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < 5).

    1 at i=j then beautiful
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];

        int fi=0,fj=0,steps=0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++){
                int temp = in.nextInt();
                if(temp == 1){fi = i; fj= j;}
                arr[i][j] = temp;
            }

            // Column work

            steps+= Math.abs(fi - 2);


            // Row work
            steps+= Math.abs(fj-2);

        System.out.println(steps);
    }




}
