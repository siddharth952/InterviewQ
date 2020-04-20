package com.company.CodingBlocksClass.Lecture26;

import com.company.CodingBlocksClass.Lecture24.GenericTrees;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    private Node root;

    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        this.root = insert(root,value);
    }
//TODO:Check
    private Node insert(Node node, int value) {
        if(node == null) return new Node(value);
        if(value < node.value) node.left = insert(node.left,value);
        if(value > node.value) node.right =  insert(node.right,value);
        return node;
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root,String indent) {
        if(root == null) return;
        //PreOrder
        System.out.println(indent + root.value);
        display(root.left,indent+"\t");
        display(root.right,indent+"\t");
    }

    //TODO: Sorted Array from tree
    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node) {
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    //TODO: Find Succesor
    public void findSuc(int val){
        findSuc(root,val);
    }

    private int findSuc(Node root, int val) {
        Node succ = null; //to find
        Node curr = root;

        while (curr != null) {
            if (curr.value > val) {
                if (succ == null || curr.value < succ.value)
                    succ = curr;

                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return succ.value;
        //If not found print no succ present
    }



    //TODO: Range b/w elements
    public void inrange(int k1,int k2){
        inrange(root,k1,k2);
    }
   private void inrange(Node node,int k1,int k2){
        if(node==null) return;
        if(node.value > k1 && node.value < k2){
            System.out.println(node.value);
        }
        if(node.value > k1){
            //left ie less check if its not like < k1
            inrange(node.left,k1,k2);
        }
        if(node.value < k2){
            inrange(node.right,k1,k2);
        }

    }

    //TODO: Tree from sorted Array
    public void makeFromSorted(int ar[],int start,int end){
        if(start > end){ return;}
        int mid = (start+end)/2;

        insert(ar[mid]);

        makeFromSorted(ar,start,mid-1);
        makeFromSorted(ar,mid+1,end);
    }


    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
           Node temp = queue.remove();
            System.out.println(temp.value);

            //check for NULLS
            if(temp.left != null) {queue.add(temp.left);}
            if(temp.right != null) {queue.add(temp.right);}
        }
    }

    //TODO: make from Pre in In order
    public void makeFromPre_and_In(int[] pre,int[] in){
        this.root = makeFromPre_and_In(root,pre,in);
    }

    private Node makeFromPre_and_In(Node node,int[] pre,int[] in){
        if(in.length == 0) return null;
        int val =pre[0];
        int index = find(in,val);

        int[] pre_Left = Arrays.copyOfRange(pre,1,index+1);
        int[] pre_Right = Arrays.copyOfRange(pre,index+1,pre.length);

        int[] inOrder_Left = Arrays.copyOfRange(in,0,index);
        int[] inOrder_Right = Arrays.copyOfRange(in,index+1,in.length);

//        Node newNode = new Node(val);
//        Node left = makeFromPre_and_In();
//        Node right = makeFromPre_and_In();

        

    }

    private int find(int[] in, int val) {
        for (int i=0;i<in.length;i++){
            if(in[i] == val) {return i;}
        }
        return -1;
    }
}
