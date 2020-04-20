package com.company.CodingBlocksClass.Lecture24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTrees {
    private Node root;

    class Node{
        int value;
        ArrayList<Node> neighbours;

        public Node(int value){
            this.value = value;
            this.neighbours = new ArrayList<>();
        }
    }

    //FUNCTIONS

    public void insert(Scanner s){
        System.out.println("Enter value for root: ");
        int val = s.nextInt();
        this.root = new Node(val);
        //Use Method overloading
        insert(root,s);

    }

    private void insert(Node node, Scanner s) {
        while(true){
            System.out.println("Want to add child of "+node.value);
            Boolean yes = s.nextBoolean();
            if(yes){
                System.out.println("Enter value of node: ");
                int val = s.nextInt();
                Node child = new Node(val);
                node.neighbours.add(child);
                // Now for the new node add child of this?
                insert(child,s);
            }
            else{
                break;
            }
        }
    }


    //for client
    public void display(){
        display(root,"");
    }



    private void display(Node node,String indent){

        System.out.println(node.value + " ");
        if(node.neighbours.isEmpty()) return;


        //OR for(int i=0;i<root.neibours.size;i++) and use display(node.children.get(i))
        //for childrens
        for (Node onenode :
                node.neighbours) {
            display(onenode,indent+"\t");
        }

    }

    public int count(){ return  count(root); }

    private int count(Node node) {
        int count = 1;

        for(int i = 0; i<node.neighbours.size();i++){
            count += count(node.neighbours.get(i));
        }
        return count;
    }

    //TODO: Maximum of the nodes
    public int max(Node node){
        int max = node.value;
        return max(node,max);
    }

    private int max(Node node,int max){
        if(max < node.value){
            max = node.value;
        }
        for(int i =0;i<node.neighbours.size();i++){
            max = max(node.neighbours.get(i),max);
        }
        return max;
    }

    public void atlevel(int k){
        atlevel(root,k);
    }

    //TODO: Print of levels
    private void atlevel(Node node,int k ){
        if(k == 0) System.out.println(node.value);

        for(int i =0;i<node.neighbours.size();i++){
            atlevel(node.neighbours.get(k),k-1);
        }
    }


    //TODO: Level order
    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.println(temp.value);
            //Temp's children
            for(int i = 0;i<temp.neighbours.size();i++){
                queue.add(temp.neighbours.get(i));
            }
        }
    }

}
