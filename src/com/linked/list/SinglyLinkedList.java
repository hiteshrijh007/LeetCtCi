package com.linked.list;




public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList (){
        head=null;
    }

    public void addFirst(int d){
        head = new Node(d);
    }
    public void addLast(int d){
        if(head==null){
            addFirst(d);
        }else{
            Node tmp=head;
            while(tmp.next!=null)tmp=tmp.next;
            tmp.next= new Node(d);
        }
    }
public int getData(Node d){
        return d.val;
}

public String toString(){

    StringBuilder sb = new StringBuilder();
    if(head==null){
        return sb.toString();
    }
    Node tmp=head;
    while(tmp!=null){
        sb.append(String.valueOf(tmp.val));
        tmp=tmp.next;
    }
    return sb.toString();
}



    private static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val=val;
            next=null;
        }
    }

}
