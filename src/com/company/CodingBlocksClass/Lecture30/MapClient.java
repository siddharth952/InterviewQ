package com.company.CodingBlocksClass.Lecture30;

public class MapClient {
    public static void main(String[] args) {
        AdjacencyMapGraph adjacencyMapGraph = new AdjacencyMapGraph();
        adjacencyMapGraph.addVertex("A");
        adjacencyMapGraph.addVertex("B");
        adjacencyMapGraph.addVertex("C");
        adjacencyMapGraph.addVertex("D");

        adjacencyMapGraph.addEdge("A","B");
        adjacencyMapGraph.addEdge("B","C");
        adjacencyMapGraph.addEdge("C","D");
        adjacencyMapGraph.addEdge("A","D");

        adjacencyMapGraph.display();
    }
}
