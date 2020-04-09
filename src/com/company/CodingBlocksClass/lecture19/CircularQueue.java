package com.company.CodingBlocksClass.lecture19;


//deque size is decre
public class CircularQueue {

    private int[] data;
    private int front;
    private int end;
    private int size;

    public CircularQueue(int size){
        this.data = new int[size];
        this.front = 0;
        this.end = 0;
        this.size = 0;
    }



    public void enqueue(int element){
        //Enter element here
        data[end++] = element;
        size++;
        end = end%data.length;

    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }

        int temp = data[front];

        //front ++ and circular size
        front++;
        front = front%data.length;
        size--;

        return temp;
    }

    public void display(){
        for(int i =0;i<size;i++) {
            System.out.print(data[front++] + " ");
            front = front % data.length;
        }
    }

    private boolean isEmpty() { return size == 0; }

}
