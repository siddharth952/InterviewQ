package com.company.HackerBlocks;

public class Treetopview {
    public static void main(String[] args) {

    }
    class BinaryTreeT{

        private Node root;
        public class Node{
            int val;
            Node left;
            Node right;
            public Node(int val){
                this.val = val;
            }

            public int parent(int indexChild){
                return (indexChild-1)/2;
            }
            public int leftChild(int indexParent){
                return 2*indexParent +1;
            }
            public int rightChild(int indexParent){
                return 2*indexParent +2;
            }


            public void insertLevel(int value){
                insertLevel(root,value);
            }

            private void insertLevel(Node root, int value) {

            }


        }
    }


}
