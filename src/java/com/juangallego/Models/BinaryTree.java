package com.juangallego.Models;

import java.util.HashMap; 
import java.util.Map; 

public class BinaryTree  
{ 
    public Node root, n1, n2, lca; 
  

    public Node insert(Node node, int key)  
    { 

        if (node == null) 
            return new Node(key); 
  

        if (key < node.value)  
        { 
            node.left = insert(node.left, key); 
            node.left.parent = node; 
        } 
        else if (key > node.value)  
        { 
            node.right = insert(node.right, key); 
            node.right.parent = node; 
        } 
  
        return node; 
    } 
  
    //Metodo que recibe dos objetos de tipo nodo como paràmetros y retorna el ancestro comùn màs bajo
    public Node LCA(Node n1, Node n2)  
    { 

        Map<Node, Boolean> ancestors = new HashMap<Node, Boolean>(); 
  

        while (n1 != null)  
        { 
            ancestors.put(n1, Boolean.TRUE); 
            n1 = n1.parent; 
        } 

        while (n2 != null)  
        { 
            if (ancestors.containsKey(n2) != ancestors.isEmpty()) 
                return n2; 
            n2 = n2.parent; 
        } 
  
        return null; 
    } 
    
     public Node Find(int nodo ) 
        {
            Node reco=root;
            while (reco!=null) 
            {
                if (nodo==reco.value)
                    
                    return reco;
                else
                    if (nodo>reco.value)
                        reco=reco.right;
                    else
                        reco=reco.left;
            }
            
            return reco;
        }
} 