package com.company.CodingBlocksClass;

import java.util.Scanner;

public class Lecture15 {

    public static int magicNumof5(int n){
        //5,25,30(25+1) so 0011 <- here add 1 ie multple of 5 and add it
        int res = 0;
        int pow = 1; //power start from 1
        //pow 1

        while(n!=0){
            pow = pow*5; //incre pow 5^1 then 5^2 ...
            if((n&1) ==1){ //for least significant
                res = res + pow;
            }
            n = n>>1;
        }

        //get back nth
        return res;
    }

    public static void findUnique2(int n[]){


            int pow = 0;
            int mask = 0;
        for(int i=0;i<n.length-1;i++){

            if((n[i] ^ n[i+1]) == 0) { //3,3 XOR - > 0
                i++;
            }
            else{
                //make MASK 1(1)0
                while(pow < 4) {
                    if(((n[i] ^ n[i + 1]) & 1) == 1){
                        mask = 2*pow; //010
                    }
                }
            }
        }
    }

    public static void XOREngine(){
        /*
        1≤T≤100
        1≤N,Q≤105
        T⋅(N+Q)≤4⋅106
        1≤Ai≤108 for each valid i
        1≤P≤105

         */


        //Test Case:T
        int T = 0;
        int N=0,Q=0;

        Scanner s = new Scanner(System.in);
        //System.out.println("\nEnter T:");
        T = s.nextInt();
        if((T < 1 || T>100))
            return;


        while(T > 0){

            N = s.nextInt();
           Q = s.nextInt();
            if((N < 1 || N>100000))
                return;
            if((Q < 1 || Q>100000))
                return;
            if( (T*(N+Q)) > 4* 1000000 )
                return;



            int even = 0, odd = 0;

            int A[] = new int[N];
            int BXOR[] = new int[N];
            for(int i=0;i<N;i++){
                int input = s.nextInt();

                if((input< 1 || input>100000000))
                    return;
                A[i] = input;

            }

            while(Q != 0){//Q Lines each with single integer P(input here)
                even = 0;
                odd = 0;
            int P = s.nextInt();
                if((P < 1 || P>100000))
                    return;
            // Logic
            for(int i=0;i<N;i++){
                BXOR[i] = (A[i] ^ P);
            }
            //Count SetBits of each BXOR[i] and update even || odd
            for(int Belement:BXOR){
                int count = 0;
                while(Belement != 0){
                    if((Belement & 1) == 1){
                    //0001 <- so incre
                    count++;
                    }
                    Belement = Belement >> 1;
                }
                if(count % 2 == 0){
                    //even
                    even++;
                }else{
                    odd++;
                }

            }
                System.out.println(even+" "+ odd);
            Q--;
            }


            //End of while
            T--;
        }

    }


    public static void uniqueNo2(int arr[]){
        // 3,3,4,4,5,7



        int uni1 = 0,uni2 = 0;
        int pos = 0;
        int res = 0;

        int xOR = arr[0];
        //3 and +1 ie 3

        //XOR cancel all non unique
        for(int i=1;i<arr.length;i++){
            xOR ^= arr[i];

        }
        //catch result
        res = xOR;

        //for mask
        while( (res & 1) != 1 ){ //#Error possible that you put ^ instead
            pos++;
            res = res >> 1;
        }
        int mask = (1<<pos);

        //find unique1
        for(int i=0;i<arr.length;i++){
            //found
            if( (mask & arr[i]) >= 1){  //#Error possible that you put ^ instead
                uni1 = arr[i];
            }
        }

        //for unique 2 xor res to get 2nd

        uni2 = res ^ uni1;

        System.out.print(uni1 + " " + uni2);

    }



}
