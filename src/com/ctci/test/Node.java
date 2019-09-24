package com.ctci.test;

public class Node{

    private Node [] adjacent;
    private int adjacentCount;
    private String vertex;
    public State state;
    public Node (String vertex, int adjacentLength){
        this.vertex=vertex;
        this.adjacentCount=0;
        adjacent= new Node[adjacentLength];
    }

    public void addAdjacent(Node x){
        if(adjacentCount < adjacent.length){
            adjacent[adjacentCount]=x;
            adjacentCount++;
        }else{
            System.out.println("No more adjacent can be added");
        }
    }

    public Node [] getAdjacent(){return  adjacent;}
    public String getVertex(){return vertex;}


}
