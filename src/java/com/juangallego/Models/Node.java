package com.juangallego.Models;

public class Node  
{ 

    int value; 
    Node left, right, parent; 
  
    public Node(int key)  
    { 
        this.value = key; 
        left = right = parent = null; 
    } 

    public Node() {
        this.value = 0; 
        left = right = parent = null; 
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
    
} 
  
