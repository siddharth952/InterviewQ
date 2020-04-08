package com.company.Lecture22;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;


    // of linkedlist private
    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addElement(int input){
        Node newObj = new Node(input);
        newObj.next = head;
        head = newObj;

        //First Node
        if(tail == null)
            tail = head;

        size++;
    }

    public void addElementLast(int input){
        if(size == 0){
            addElement(input);
            return; // DONT FORGET
        }
///         WITHOUT FRONT
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        Node newObject = new Node(input);
//        newObject.next = null;
//        temp.next = newObject;

        Node node = new Node(input);
        tail.next = node;
        tail = node;
        size++;

    }

    public int deleteFirst(){
        if(size == 0){ System.out.println("Empty");
        return -1;
        }

        int outputValue = head.value;

        head = head.next;

        //edge case
        if(head == null)
            tail = null; //as it is empty

        size--;
        return outputValue;
    }

    public int deleteLast(){

        if(size < 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int outputValue = temp.next.value;
        temp.next = null;
        size--;
        return outputValue;
    }


    public void display(){

        Node temp = head;
        while(temp != null){ //NOT IN WHILE this -> temp.next != null
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public Node get(int index){
        Node temp = head;
        if(index > size){
            //return
        }
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insertAt(int index,int value){
        if (index == 0) {
            addElement(value);
        } else if(index == size) {
            addElementLast(value);
        }
        Node tempPrev = get(index-1);
        Node newNode = new Node(value);
        newNode.next = tempPrev.next;
        tempPrev.next = newNode;
    }


}
