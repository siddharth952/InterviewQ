package com.company.Lecture22;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int i= 0;
        while(i<10){
            linkedList.addElement(i);
            i++;
        }
        linkedList.addElementLast(22);
        linkedList.display();
//
//        System.out.println(linkedList.deleteFirst());
//        System.out.println(linkedList.deleteLast());
        linkedList.insertAt(2,44);
        linkedList.display();

    }


}
