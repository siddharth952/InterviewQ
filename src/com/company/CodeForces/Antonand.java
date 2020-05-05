package com.company.CodeForces;

import java.util.Scanner;

public class Antonand {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        int a=0,d=0;

        for (int i = 0; i < n; i++)
            if (arr[i] == 'A') a++; else d++;

        if(a>d) System.out.println("Anton");
        else if(d>a) System.out.println("Danik");
        else if(a==d){
            System.out.println("Friendship");
        }


    }

}
