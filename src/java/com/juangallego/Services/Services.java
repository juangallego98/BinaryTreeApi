package com.juangallego.Services;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.juangallego.Models.BinaryTree;
import com.juangallego.Models.Node;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;

@Path("/services")
public class Services {
    
    
    //recurso que crea un arbol binario balanceado
    @Path("/build")   
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response BuildTree(String data){

            JsonParser jsonParser = new JsonParser();            
            JsonObject jo = (JsonObject)jsonParser.parse(data);            
            JsonArray JTree = jo.getAsJsonArray("Tree");
            
            Gson googleJson = new Gson();           
            ArrayList Atree = googleJson.fromJson(JTree, ArrayList.class);           
            System.out.println("Arbol: "+Atree.toString());

            
        BinaryTree tree = new BinaryTree();
        
        for(int i = 0; i < Atree.size(); i++ ){           
            int value = Integer.parseInt(Atree.get(i).toString());           
            tree.root = tree.insert(tree.root, value);            
            System.out.println(value);
        }
                 
        return Response.ok("ARBOL CREADO EXITOSAMENTE").build();
    
    } 
    
    //Recurso que crea un arbol binario balanceado y retorna el ancestro comùn mas bajo de dos nodos
    @Path("/ancestor")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response BuildTreeLCA(String data){


            JsonParser jsonParser = new JsonParser();           
            JsonObject jo = (JsonObject)jsonParser.parse(data);
            
            JsonArray JTree = jo.getAsJsonArray("Tree");
            JsonArray JNode = jo.getAsJsonArray("Nodes");
            
            Gson googleJson = new Gson();
            
            ArrayList Atree = googleJson.fromJson(JTree, ArrayList.class);
            ArrayList Anode = googleJson.fromJson(JNode, ArrayList.class);
            
            
            System.out.println("Arbol: "+Atree.toString());
            System.out.println("Nodos: "+Anode.toString());
            
        BinaryTree tree = new BinaryTree();
        
        for(int i = 0; i < Atree.size(); i++ ){            
            int value = Integer.parseInt(Atree.get(i).toString());           
            tree.root = tree.insert(tree.root, value);             
            System.out.println(value);
        }
                 
         Node nodeOne = new Node(0); 
         Node nodeTwo = new Node(0);
         Node nodeThre = new Node(0);
         
         nodeOne = tree.Find(Integer.parseInt(Anode.get(0).toString()));
         nodeTwo = tree.Find(Integer.parseInt(Anode.get(1).toString()));                
         nodeThre = tree.LCA(nodeOne, nodeTwo);

        return Response.ok("Ancestor: " + nodeThre.getValue()).build();
    
    } 
    
    
}
