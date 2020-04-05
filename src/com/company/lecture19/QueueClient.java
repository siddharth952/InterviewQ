package com.company.lecture19;

public class QueueClient {

    public static void main(String[] args) throws Exception {

        CircularQueue queueC = new CircularQueue(3);
        queueC.enqueue(1);
        queueC.enqueue(2);
        queueC.display();
        System.out.println();
        System.out.print(queueC.dequeue());
        System.out.println();
        queueC.display();
        queueC.enqueue(22);
        queueC.display();

    }

}
