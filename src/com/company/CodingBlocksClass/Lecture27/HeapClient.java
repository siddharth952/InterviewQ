package com.company.CodingBlocksClass.Lecture27;

public class HeapClient {
    public static void main(String[] args) throws Exception {
        Heaps heaps = new Heaps();
        heaps.insert(2);
        heaps.insert(3);
        heaps.insert(5);
        heaps.insert(1);
        heaps.display();
        System.out.println(heaps.remove());
        heaps.display();
        System.out.println(heaps.remove());
        heaps.display();
    }
}
