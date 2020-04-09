package com.company.CodingBlocksClass.lecture19;

public class Stack {

        private int[] data;
        private int top;
        private int DEFAULT_SIZE = 10;

        public Stack(){
            this.data = new int[DEFAULT_SIZE];
            this.top = 0;
        }

        public void push(int N){
            this.data[top] = N;
            top++;
        }
        public int pop() throws Exception{
            if(top==0){
                //Handle Exception Here. if not main will take care of it
                throw new Exception("Kahlii");
            }
            int temp = data[top-1];
            top--;

            return temp;

        }

}
