package com.company;

public class Lecture14 {


    public static void evenodd(int n){

        if((n&1) == 1){
            System.out.println("odd no");

        }
        else{
            System.out.println("even no");
        }

    }

    public static int unique(int n[]) {

        int res = 0;

        for(int i=0;i<n.length;i++){

            res = res^n[i];
        }
        return res;
    }

    public static int countSetBits(int number) {
        //1010 and 1 -> 1010 >> 1 0101 and 1 -> 0101 so 1 so counter++
        int counter = 0;
        while (number != 0) {
            // XOR Wrong number = number ^1;
            if ((number & 1) == 1) {
                counter++;

            }
            number = number >> 1;

        }
        return counter;
    }
}
