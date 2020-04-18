package com.company.CodingBlocksClass.Lecture25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClient {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input");

        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(file);

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        //tree.displayPost();
        System.out.println(tree.height());
        System.out.println(tree.diameter());

    }
}
