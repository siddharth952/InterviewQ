package com.company.CodingBlocksClass.Lecture22;

public class LinkedListClient {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        int i= 0;
//        while(i<10){
//            linkedList.addElement(i);
//            i++;
//        }
//        linkedList.addElement(2);
//        linkedList.addElement(8);
//        linkedList.addElement(13);
////        linkedList.addElementLast(22);
////        linkedList.display();
//
//        LinkedList l2 = new LinkedList();
//        l2.addElement(1);
//        l2.addElement(5);
//        l2.addElement(11);
//        linkedList.merge(l2);


        LinkedList list = new LinkedList();
        list.addElementLast(3);
        list.addElementLast(4);
        list.addElementLast(2);
        list.addElementLast(1);
//        list.insertfirst(3);
//        list.insertfirst(2);
//        list.insertlast(3);

        list.display();
        System.out.println();

        LinkedList list1 = list.mergesort(list);
        list1.oddevenList();

        list1.display();

//
//        System.out.println(linkedList.deleteFirst());
//        System.out.println(linkedList.deleteLast());
//        linkedList.insertAt(2,44);
//        linkedList.addElement(22);linkedList.addElement(22);linkedList.addElement(22);linkedList.addElement(22);linkedList.addElement(22);
//        linkedList.display();
//        linkedList.removeDup();
//        linkedList.display();

//
//        java.util.LinkedList mylist = new java.util.LinkedList<>();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(2);mylist.add(2);mylist.add(2);mylist.add(2);mylist.add(2);mylist.add(2);mylist.add(2);mylist.add(2);
//        mylist.add(3)
//        System.out.println(mylist.peek());
//        System.out.println(mylist.get(1));
//        mylist.descendingIterator();
//


    }


}
