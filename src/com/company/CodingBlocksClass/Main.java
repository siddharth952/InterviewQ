package com.company.CodingBlocksClass;

import java.util.ArrayList;

public class Main {
    //int flag = 0;
    public static ArrayList<String> output = new ArrayList<String>();

    public static void main(String[] args) {

    //Section7 section7 = new Section7();
     //   System.out.println(section7.boardPath(0,10));
        Lecture14 lecture14 = new Lecture14();
        //lecture14.evenodd(6);
        //int a[] = {1,1,2,2,3,4,5};
        //System.out.println(lecture14.unique(a));
//        System.out.println(lecture14.countSetBits(1234));
//
       Lecture15 lecture15 = new Lecture15();
//
           // int n[] = {1,1,2,3};
           // lecture15.uniqueNo2(n);








    }

/*
        Test Codes
        //to_HHH(u,p);
        //dice("",10);
        numPad("", "12");

        //  System.out.println("Processing Complete");

        CodeWars.Jaden_Casing("the true");
        int [] nums = {1,2,-1,-2};


        CodeWars.firstMissingPositive(nums);

/*
        Scanner scan = new Scanner(System.in);
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        ArrayList<Integer> list = new ArrayList();
        list.add(c1);
        list.add(c2);
        System.out.println(list.);

 */
/*
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        ArrayList<Integer> zero_ones = new ArrayList();
        ArrayList<Integer> zero = new ArrayList();
        ArrayList<Integer> ones = new ArrayList();

        for(int i=0;i<length;i++){
            int n = s.nextInt();
            if(n == 0)
                zero.add(0);
            else{
                ones.add(1);}
        }

        for(int i =0;i<zero.size();i++){
            System.out.print(0+" ");

        }
        for(int i =0;i<ones.size();i++){
            System.out.print(1 + " ");
        }

 */

       // String p = "";
       // String u = "abcd";


       // subseq(p,u);

/*
        numPad("", "12");
        Scanner s = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        String inputString = s.nextLine();
        for(int i=0;i<inputString.length();i++) {

            //key value
            if (map.containsKey(inputString.charAt(i))) {
                map.replace(("" + inputString.charAt(i)), (map.get(inputString.charAt(i)) + 1));
            } else {
                map.put(("" + inputString.charAt(i)), 1);
            }


        }


        System.out.println(map.get("a"));


 */









    private static void subseq(String p, String u) {
        //base case
        if (u.isEmpty()) {
            System.out.println(p);
            //out.si
            return;
        }
        char ch = u.charAt(0);  //A <- B  C
        u = u.substring(1);

        //left
        subseq(p + ch, u);

        //right
        subseq(p, u);
    }

    public static void to_HHH(String processed, String unprocessed) {
        //base
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        //check for i
        if (unprocessed.charAt(0) != 'i') {

            to_HHH(unprocessed.substring(1), processed + ch);
        }
        to_HHH(unprocessed, processed);

    }


    public static void dice(String processed, int target) {
        // 1,2,3,4,5,6
        /*
        We use loop inside the recursive call from 1...6
        we add to processed and then sub from target with i
         */

        if (target == 0) {
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(processed + i, target - i);
        }

    }

    public static void numPad(String processed, String unprocessed) {
        /*[abc] , [def] , [ghi]
          [jkl] , [mno] , [pqr]
          [stu] , [vwx] , [yz]


          1 -> a,b,c
         */
        if (unprocessed.isEmpty()) {
            System.out.println(processed);

            return;
        }

        int digit = Integer.parseInt(String.valueOf((unprocessed.charAt(0))));
        //int digit = Integer.parseInt(String.valueOf((unprocessed.charAt(0))));
        //or int digit = unprocessed.charAt(0) - '0' Sub ASCII of 0

        unprocessed = unprocessed.substring(1);

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {
            if(i==26){
                continue;
            }

            numPad(processed + (char) (i + 'a'), unprocessed);

        }


    }
}





/*

public class Recursioneg {

        public static void main(String[] args) {
            int ar[] = {1, 2, 5, 2, 3};
            System.out.println(findelement(ar, 0, 3));
            System.out.println(lastfindelement(ar,ar.length-1,1));
            pattern(4,0);
            System.out.println(isSorted(ar,0));
        bubblesort(ar,ar.length-1,0);
            System.out.println(Arrays.toString(ar));
        }

        public static int findelement(int ar[], int index, int ele) {

            if (index == ar.length) {
                return -1;
            }

            if (ar[index] == ele) {
                return index;
            }

            return findelement(ar, index + 1, ele);
        }

        public static boolean isSorted(int ar[], int index) {

            if (index == ar.length - 1) {
                return true;
            }

            if (ar[index] > ar[index + 1]) {
                return false;
            }

            return isSorted(ar, index + 1);
        }

        public static void pattern(int row, int col){

            if(row==0){
                return;
            }

            if(col==row){
                System.out.println();
                pattern(row-1,0);
                return;
            }
            System.out.print("*");
            pattern(row,col+1);
        }

    public static void bubblesort(int[] ar,int row, int col){

        if(row==0){
            return;
        }

        if(col==row){
            bubblesort(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            Arrayques.swap(ar,col,col+1);
        }

        bubblesort(ar,row,col+1);
    }

    public static int lastfindelement(int ar[], int index, int ele) {

        if (index<0) {
            return -1;
        }

        if (ar[index] == ele) {
            return index;
        }

        return lastfindelement(ar, index - 1, ele);
    }

}

 */