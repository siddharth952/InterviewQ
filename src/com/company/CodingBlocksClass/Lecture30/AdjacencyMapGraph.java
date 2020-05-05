package com.company.CodingBlocksClass.Lecture30;
import java.util.*;


public class AdjacencyMapGraph<T> {

    //Normal map
    Map<T,Vertex> vertexMap = new HashMap<>();
    //Kruskal
    Map<Vertex,Vertex> parent = new HashMap<>();



    public void addVertex(T value){

        vertexMap.put(value,new Vertex(value));
    }

    public void addEdge(T first,T second){
        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){
            vertexMap.get(first).neighbour.put(vertexMap.get(second),1);
            vertexMap.get(second).neighbour.put(vertexMap.get(first),1);
        }
    }

    public void addEdgeweight(T first,T second, int weight){
        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){
            vertexMap.get(first).neighbour.put(vertexMap.get(second),weight);
            vertexMap.get(second).neighbour.put(vertexMap.get(first),weight);
        }
    }



    public void display(){
        for (Vertex vertex: vertexMap.values()) {

            System.out.print(vertex.value + "=>");

            for (Vertex padosi:vertex.neighbour.keySet()){
                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    //TODO: Kruskal

    public void setParent(){
        // Set null
        for (Vertex vertex:vertexMap.values()) {
            parent.put(vertex,null);
        }
    }

    public boolean union(Vertex first,Vertex second){
        Vertex f = find(first);
        Vertex s = find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }
        return false;
    }

    private Vertex find(Vertex vertex){
        while(parent.get(vertex) != null){
            vertex = parent.get(vertex);
        }
        return vertex;
    }

    class Edge implements Comparable<Edge>{
        Vertex first;
        Vertex second;
        Integer weight;

        public Edge(Vertex first, Vertex second, Integer weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    public AdjacencyMapGraph<T> Kruskal(){
        setParent();

        AdjacencyMapGraph<T> map = new AdjacencyMapGraph<>();

        ArrayList<Edge> edges = new ArrayList<>();

        for(T vertex:vertexMap.keySet()){
            map.addVertex(vertex);
        }

        for(Vertex vertex:vertexMap.values()){
            for(Vertex padosi:vertex.neighbour.keySet()){
                edges.add(new Edge(vertex,padosi,vertex.neighbour.get(padosi)));
            }
        }

        Collections.sort(edges);

        for(Edge e:edges){
            if(union(e.first,e.second)){
                map.addEdgeweight(e.first.value, e.second.value, e.weight);
            }
        }
        return map;
        }




        // Prims
        public int prims(){
            int totalcost = 0;
            Set<Vertex> visited = new HashSet<>();

            PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

            Vertex vertex = vertexMap.values().iterator().next();

            visited.add(vertex);

            for(Vertex neighbour:vertex.neighbour.keySet()){
                priorityQueue.add(new Edge(vertex,neighbour,vertex.neighbour.get(neighbour)));

            }

            while(!priorityQueue.isEmpty()){
                Edge temp = priorityQueue.remove();
                if(visited.contains(temp.first) && visited.contains(temp.second)){
                    continue;
                }

                totalcost += temp.weight;

                if(!visited.contains(temp.first)){
                    for (Vertex neighbour:temp.first.neighbour.keySet()){
                        priorityQueue.add(new Edge(temp.first,neighbour,temp.first.neighbour.get(neighbour)));
                    }

                }


            }





        }










    class Vertex{

        T value;
        //For Neighbour
        Map<Vertex,Integer> neighbour;

        public Vertex(T value){
            this.value = value;
            this.neighbour = new HashMap<>();
        }
    }

}



