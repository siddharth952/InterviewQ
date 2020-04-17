package com.company.Leetcode;


public class toLowerCase {

    public static void main(String[] args) {
        toLowerCase("TestSTSDDD sDF!wD");
    }

    public static String toLowerCase(String input){
        char[] arr = input.toCharArray();
       for(char ch : arr){
           if(ch>='A' && ch<='Z'){
               //Change to lower
               ch = (char) (ch - 'A' + 'a'); //Sub till A then new offset a
           }

       }
        return new String(arr);

    }
}
