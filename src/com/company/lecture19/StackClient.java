package com.company.lecture19;

public class StackClient {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(33);
        try {
            System.out.print(stack.pop());
            System.out.print(stack.pop());
            System.out.print(stack.pop());
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
