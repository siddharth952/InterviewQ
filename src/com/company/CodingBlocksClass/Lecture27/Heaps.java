package com.company.CodingBlocksClass.Lecture27;

import java.util.ArrayList;

public class Heaps {

    ArrayList<Integer> list = new ArrayList<>();

    public void insert(int element){
        //Compare with Parent (Min/Max)
        list.add(element);
        upHeap(list.size()-1);
    }

    private void upHeap(int index) {
        if(index == 0) {return;}
        int parent = parent(index);
        if(list.get(parent) > list.get(index)){ //less goes up
            swap(parent,index);
            upHeap(parent); //Do for Parent
        }
    }

    private void swap(int parent, int index) {
        int temp = list.get(index);
        list.set(index,list.get(parent));
        list.set(parent,temp);
    }


    //Print
    public void display() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Khaali he bhai");
        }
        System.out.println(list);
    }

    //TODO: Delete
    public int remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Khaali he bhai");
        }
        int temp = list.get(0);//value of first
        int last = list.remove(list.size() -1);

        if(!list.isEmpty()) {
            list.set(0,last);
            downHeap(0);
        }
        return temp;



    }
    private void downHeap(int index) {
        int min = index;

        int left = leftChild(index);
        int right = rightChild(index);
        //edge case check for no child
        if(left<list.size() && list.get(min)>list.get(left)){
            min = left;
        }
        if(right<list.size() && list.get(min)>list.get(right)){
            min = right;
        }
        if(min!=index){
            swap(min,index);
            downHeap(index);
        }
    }


    public int parent(int index){
        return (index-1)/2;
    }
    public int leftChild(int index){
        return (2*index)+1;
    }
    public int rightChild(int index){
        return (2*index)+2;
    }




}
