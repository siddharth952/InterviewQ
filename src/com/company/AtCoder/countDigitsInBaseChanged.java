package com.company.AtCoder;
import java.util.*;

public class countDigitsInBaseChanged {


        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int N,K;
            N = s.nextInt();
            K = s.nextInt();
        
            findNumberOfDigits(N,K);

        }

        static void findNumberOfDigits(long n, int base)
        {

            // Calculating log using base changing
            // property and then taking it
            // floor and then adding 1.
            int dig = (int)(	Math.floor( Math.log(n) / Math.log(base)	)  + 1);


            // printing output
            System.out.print(dig);
        }
        
    static int countDigit(long n)
    {
        String s = Integer.toString(12);
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }


}
