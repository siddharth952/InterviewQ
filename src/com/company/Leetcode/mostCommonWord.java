package com.company.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mostCommonWord {
    //Given a paragraph, list of banned words, return most frequent word that is not banned

    public static void main(String[] args) {
        String[] test = {"ball","tall"};
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", test));
    }

    public static String mostCommonWord(String para,String[] banned){
        /*
         Step 1: Remove punctuations -> , ,(,) ,! ?
         Step 2: Change to lowercase
         Step 3: Words count for each word not in banned set
         Step 4: Return most common
         */

        // Split paragraph
        String[] words = para.toLowerCase().split("\\W+"); //regular expression defines a search pattern for strings

        // add banned words to set
        /*
        A collection that contains no duplicate elements.  More formally, sets
        contain no pair of elements {@code e1} and {@code e2} such that
         {@code e1.equals(e2)}, and at most one null element.  As implied by
        its name, this interface models the mathematical <i>set</i> abstraction.
         */

        Set<String> set = new HashSet<>();
        for(String word:banned){ set.add(word);}

        // Add paragraph words to a Map of type Hashmap
        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            if(!set.contains(word)) map.put(word, (map.getOrDefault(word,0) +1 ));
        }

        // Get the most frequent word
        int wordMaxFreq = 0;
        String resWord = "";
        for (String str:map.keySet()){  //view of the keys contained in this map ie words
            if(map.get(str) > wordMaxFreq ){
                wordMaxFreq = map.get(str);
                resWord = str;
            }
        }
        return resWord;
    }
}
