package com.company.CodingBlocksClass.Lecture25;

import com.company.CodingBlocksClass.Lecture24.GenericTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void insert(Scanner s){
        this.root = insert(root,s);
    }
    private Node insert(Node node, Scanner s){

        if(node == null){
            System.out.println("Enter Value:");
            int val = s.nextInt();
            return new Node(val);
        }
        System.out.println("Enter direction: ");
        String dir = s.next();

        if(dir.equals("left")){
            node.left = insert(node.left,s);
        }
        else{
            node.right = insert(node.right,s);
        }
        return node;
    }

    public void displayPre(){
        displayPre(root,"");
    }
    private void displayPre(Node node,String indent){
            if(node == null) return;

            System.out.println(indent + node.value);

            displayPre(node.left,indent+"\t");
            displayPre(node.right,indent+"\t");
    }

    public void displayPost(){
        displayPost(root,"");
    }

    private void displayPost(Node node, String indent) {
        if(node == null) return;

        displayPost(node.left,indent+"\t");
        displayPost(node.right,indent+"\t");
        System.out.println(indent+node.value);
    }


    //TODO:Height Of Tree
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null) return 0;
        return 1+ Math.max(height(node.left),height(node.right));
    }

    //TODO: Tell if Node is present
    public Node findNode(int tofind){
        return findNode(root,tofind);
    }
    private Node findNode(Node node, int toFind){
        if(node == null) return null;
        if(node.value == toFind) return node;

        findNode(node.left,toFind);
         findNode(node.right,toFind);

        return null;
    }

    //TODO: Diameter of a tree Node to Node Streached Longest distance
    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node) {
        if(node == null) return 0;
        int current = height(node.left) + height(node.right);
        int max = Math.max(diameter(node.left),diameter(node.right));
        return Math.max(current,max);
    }


    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

}
