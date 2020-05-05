package com.company.CodingBlocksClass.Lecture12;

public class LexicoNum {

    public static void main(String[] args) {
        String str = "0123456789";
        int[] f = new int[10];
        //freq(str,f);
        //lexoNum("",f,str.length());
        print_lexiographicall(10,0);

    }

    private static void freq(String str, int[] f) {
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            f[num - '0']++;
        }
    }

    public static void lexoNum(String proc,int[] f, int length){
        if(length ==0 ){
            System.out.println(proc+ " ");
            return;
        }

        for (int i = 0; i < 10; i++) {
            if(f[i] > 0){
                f[i]--;
                lexoNum(proc+(char)(i+'0'),f,length-1);
                f[i]++;
            }
        }


    }


    private static void print_lexiographicall(int n, int a)
    {
        // cout << 0 << " ";
        if(a > n)
            return;
        System.out.println(a+ " ");
        int i =0;
        if (a==0)
            i = 1;
        for(; i<=9; i++)
            print_lexiographicall(n, a*10 + i);
    }



}
