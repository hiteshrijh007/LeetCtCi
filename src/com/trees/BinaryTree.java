package com.trees;

/**
 * This is a Java Program to implement Binary Tree. A binary tree is a tree data structure in which each node has at most two child nodes,
 * usually distinguished as “left” and “right”. Nodes with children are parent nodes, and child nodes may contain references to their parents.
 * Outside the tree, there is often a reference to the “root” node (the ancestor of all nodes), if it exists. Any node in the data structure can
 * be reached by starting at root node and repeatedly following references to either the left or right child. A tree which does not have any node
 * other than root node is called a null tree. In a binary tree, a degree of every node is maximum two. A tree with n nodes has exactly n−1 branches
 * or degree.
 * Binary trees are used to implement binary search trees and binary heaps, finding applications in efficient searching and sorting algorithms.
 */



class BTNode
{
    BTNode left, right;
    int data;

    public BTNode()
    {
        left = null;
        right = null;
        data =0;
    }

    public BTNode(int n){
        left = null;
        right = null;
        data =n;
    }

    public void setLeft(BTNode n){
        left =n;
    }

    public BTNode getLeft(){
        return left;
    }

    public void setRight(BTNode n){
        right = n;
    }

    public BTNode getRight(){
        return right;
    }

    public void setData(int d){
        data=d;
    }

    public int getData(){
        return data;
    }

}

    class BT
    {
       BTNode root;

       public BT()
       {
           root= null;
       }

       public boolean isEmpty(){
           return root == null;
       }

       public void insertData(int data){
           root = insert(root,data);
       }

       public BTNode insert(BTNode node, int data){
           if( node == null){
               node = new BTNode(data);
           }
           else{
               if(node.getRight() == null){
                   node.right = insert(node.right,data);
               }else{
                   node.left = insert(node.left, data);
               }
           }
           return node;
       }

       public int countNodes(){
           return countNodes(root);
       }

       public int countNodes(BTNode root){
           if(root == null){
               return 0;
           }else{
               int l = 1;
               l += countNodes(root.getLeft());
               l += countNodes(root.getRight());
               return l;
           }
       }

       public boolean search(int val){
           return search(root, val);
       }

       public boolean search(BTNode root, int val){
           if(root.getData() == val){
               return true;
           }
           else if(root.getLeft() != null){
               if(search(root.getLeft(),val)){
                   return true;
               }
           }
           else if(root.getRight() != null){
               if(search(root.getRight(), val)){
                   return true;
               }
           }
           return false;
       }

    }

public class BinaryTree {


}
