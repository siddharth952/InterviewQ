package com.company.CodingBlocksClass.Lecture29;

import java.util.LinkedList;

public class GraphusingAdjacencyList<T> {


    LinkedList<Vertex> vertices;

    public GraphusingAdjacencyList(LinkedList<Vertex> vertices) {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){

        vertices.add(new Vertex(value));


    }

    // For edges
//    public void addEdge(T first, T second){
//        Vertex f = get(first); //Vertices list is name verticx we get
//        Vertex s = get(second);
//        // Check Null
//        if(f!=null && s!=null){
//            //Undirected
//            f.neighbours.add(s);
//            s.neighbours.add(f);
//        }
//    }

    public void display(){
        for (Vertex vertex:vertices){
            System.out.println(vertex.value + "=>");

          //  for(Vertex)
        }
    }


//    private Vertex get(T val) {
//        for(Vertex vertex: vertices){
//            if(vertex.value.equals(val)){
//                return vertex;
//            }
//        }
//
//
//        return vertices[0];
//    }

    class Vertex{
        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value){
            this.value = value;
            this.neighbours = new LinkedList<>();
        }


    }
}
