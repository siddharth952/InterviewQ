package com.company.CodingBlocksClass.Lecture23;

public interface Student {
    void study();

    default void fun(){
        System.out.println("Hello");
    }
}
