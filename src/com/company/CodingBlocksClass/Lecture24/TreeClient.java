package com.company.CodingBlocksClass.Lecture24;

import java.util.Scanner;

public class TreeClient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenericTrees genericTrees = new GenericTrees();
        genericTrees.insert(s);
        genericTrees.display();

        //System.out.println(genericTrees.count());
        genericTrees.atlevel(1);
        genericTrees.levelOrder();
    }



}


