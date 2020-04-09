package com.company.HackerBlocks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class findKthLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList myList = new LinkedList();
        //list ends when -1
        int input = 0;
        int k = 0;

        while(input != -1){
           input = s.nextInt();
           if(input == -1) continue;
           myList.add(input);
        }

        k = s.nextInt();

        findKthEnd(myList,k);

    }

    public static void findKthEnd(LinkedList givenList,int fromEnd){
        System.out.println(givenList);
        Iterator itRev = givenList.descendingIterator();
        for(int i = 1;i<fromEnd;i++)
            itRev.next();

        System.out.println(itRev.next());
    }


}
