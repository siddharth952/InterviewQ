package com.company.Leetcode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.sort;

public class groupAnagrams {


    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        //System.out.println(groupAnagrams(str));
    }



//    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
//
//        HashMap<String, ArrayList<String> > map = new HashMap<>();
//        for(String s:strs){
//            String s2 = s;
//            s2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());
//           // map.put(s2,s);
//        }
////        ArrayList<ArrayList<String>> ans = null;
////        for (Object t :
////                map) {
////            ans.add(t);
////        }
//
//
//    }



//        public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
//
//            ArrayList<ArrayList<String>> ans = new ArrayList<>();
//            int initialLength = strs.length;
//            int noOfChars = 0;
//            char[] chars = new char[3];
//
//            for (String element: strs) { // "eat"
//
//                noOfChars = element.length();
//                //Extract each char
//                    element.getChars(0,element.length(),chars,0);
//
////                System.out.print(chars);
////                System.out.print(" "+noOfChars);
//            }
//
//            return ans;
//        }
}
