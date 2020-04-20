package com.company.CodingBlocksClass.Lecture26;

public class BinarySearchTreeClient {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(22);
        binarySearchTree.insert(1);
        binarySearchTree.display();
        binarySearchTree.inorder();

        int[] ar = {3,4,5,6,7,8};
        binarySearchTree.makeFromSorted(ar,0,5);
    }



}
