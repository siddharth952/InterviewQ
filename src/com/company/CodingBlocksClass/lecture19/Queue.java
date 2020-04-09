package com.company.CodingBlocksClass.lecture19;

public class Queue {

    private int[] data;
    private int end; // [ 1,2,3,4] <-
    private int DEFAULT_SIZE = 10;

    public Queue(){
        this.data = new int[DEFAULT_SIZE];
        this.end =0;
    }

    public void enqueue(int n){
        if(isFull()){
            return;
        }
        data[end++]=n;
    }

    private boolean isFull() {
        return end==data.length;
    }

    public void dequeue() throws Exception{
        //check if empty
        if(end == 0){
            throw new Exception("Kahlii");
        }
        //take first
        int temp = data[0];
        //now shift
        for(int i=1;i<end;i++){
            data[i-1] = data[i];
            end--;
        }
    }

}
