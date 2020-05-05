package com.company.CodeForces;

import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();
        int h = in.nextInt();

        int u1 = in.nextInt();
        int d1 = in.nextInt();

        int u2 = in.nextInt();
        int d2 = in.nextInt();

        while(h!=0){
            w+= h;
            if(h == d1)
                w -= u1;

            //Hit Stone 2
            if(h == d2)
                w -= u2;
            w = Math.max(w,0);
            h--;
        }

        System.out.println(w);
    }
}
