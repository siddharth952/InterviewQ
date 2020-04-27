package com.company.CodingBlocksClass.Lecture28;
import java.util.HashMap;
import  java.util.*;

public class HashMapsEg {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("apple","Teek");
        map.put("banana","mast");
        map.put("mango","bekarr");

        for (String str :
                map.keySet()) {
            System.out.println(str);
        }
        for (String val :
                map.values()) {
            System.out.println(val);
        }

    }


}
