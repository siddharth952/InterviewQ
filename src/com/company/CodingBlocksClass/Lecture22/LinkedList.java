package com.company.CodingBlocksClass.Lecture22;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;


    // of linkedlist private
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addElement(int input) {
        Node newObj = new Node(input);
        newObj.next = head;
        head = newObj;

        //First Node
        if (tail == null)
            tail = head;

        size++;
    }

    public void addElementLast(int input) {
        if (size == 0) {
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

    public int deleteFirst() {
        if (size == 0) {
            System.out.println("Empty");
            return -1;
        }

        int outputValue = head.value;

        head = head.next;

        //edge case
        if (head == null)
            tail = null; //as it is empty

        size--;
        return outputValue;
    }

    public int deleteLast() {

        if (size < 1) {
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int outputValue = temp.next.value;
        temp.next = null;
        size--;
        return outputValue;
    }


    public void display() {

        Node temp = head;
        while (temp != null) { //NOT IN WHILE this -> temp.next != null
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public Node get(int index) {
        Node temp = head;
        if (index > size) {
            //return
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertAt(int index, int value) {
        if (index == 0) {
            addElement(value);
        } else if (index == size) {
            addElementLast(value);
        }
        Node tempPrev = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = tempPrev.next;
        tempPrev.next = newNode;
        size++;
    }

    public void deleteAt(int index) {
        if (index == 0)
            deleteFirst();

        Node tempPrev = get(index - 1);
        if (tempPrev.next.next == null) deleteLast();

        tempPrev = tempPrev.next.next;
        size--;
    }

    public void removeDup() {
        if (head == null) return;
        // 1-> 2->2->2->2->3 -> NULL
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                //Till we encounter diff we go to next next
                temp.next = temp.next.next;
                size--;
            } else {
                //Next
                temp = temp.next;
            }
        }

    }

    //Public access from Client
    public void reverse() {
        reverseLinkedList(this.head);
    }

    private void reverseLinkedList(Node node) {
        if (head == null || head.next == null) return;

        //before
        if (node == tail) {
            head = tail; // HEAD is now the TAIL
            return;
        }
        reverseLinkedList(node.next);
        //after
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public LinkedList merge(LinkedList first, LinkedList second) {

        LinkedList list = new LinkedList();

        Node f = first.head;
        Node s = second.head;

        while (f != null && s != null) {

            if (f.value < s.value) {
                list.addElementLast(f.value);
                f = f.next;
            } else {
                list.addElementLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            list.addElementLast(f.value);
            f = f.next;
        }

        while (s != null) {
            list.addElementLast(s.value);
            s = s.next;
        }

        return list;
    }


    //////////////////////////////////Lecture 23


    public Node mid() {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public Node get() {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public LinkedList mergesort(LinkedList list) {

        if (list.size == 1) {
            return list;
        }

        Node mid = list.mid();

        LinkedList first = new LinkedList();
        first.head = list.head;
        first.tail = mid;
        first.size = (list.size + 1) / 2;

        LinkedList second = new LinkedList();
        second.head = mid.next;
        second.tail = list.tail;
        second.size = list.size / 2;

        mid.next = null;

        first = mergesort(first);
        second = mergesort(second);

        return merge(first, second);
    }


    public void oddevenList() {
        if (this.head == null) return;

        Node odd_head = null;
        Node odd_tail = null;
        Node even_head = null;
        Node even_tail = null;

        Node temp = head; // 1->3->6->23->9

        while (temp != null) {
            if (temp.value % 2 != 0) { //odd
                if (odd_head == null) {//empty
                    odd_head = temp;
                    odd_tail = temp;
                } else {
                    odd_tail.next = temp;
                    odd_tail = temp;
                }
            } else {
                if (temp.value % 2 == 0) { //even
                    if (even_head == null) {//empty
                        even_head = temp;
                        even_tail = temp;
                    } else {
                        even_tail.next = temp;
                        even_tail = temp;
                    }
                }
            }

            temp = temp.next;
        }
        //Connect
        odd_tail.next = even_head;
        this.head = odd_head;
        even_tail.next = null;
        this.tail = even_tail;

    }
}


