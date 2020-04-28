package com.company.CodeForces;

import java.util.Scanner;

public class BearBigBro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 4 7 -> 12 14 -> 36 28

        int years = 0;

        int a = in.nextInt();
        int b = in.nextInt();

        while(a<=b){

            a = a*3;
            b = b*2;
            years++;
        }
        System.out.println(years);

    }

}
