package com.company.HackerBlocks;
import java.util.*;

    public class TreeRightView {

        public static void main(String args[]) {

            BinaryTrees binarytree = new BinaryTrees();

            int arr[];

        }
    }
    class BinaryTrees{
        // Function to insert nodes in level order
        public Node insertLevelOrder(int[] arr, Node root, int i){
            // Base case for recursion
            if (i < arr.length) {
                Node temp = new Node(arr[i]);
                root = temp;

                // insert left child
                root.left = insertLevelOrder(arr, root.left,  2 * i + 1);

                // insert right child
                root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
            }
            return root;
        }
        public class Node{
            int value;
            Node left;
            Node right;
            public Node(int val){
                this.value = val;
            }
        }
    }


