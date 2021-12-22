package graph2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;
public class graph2 {
    vertex[] G;
 int count;
graph2(int s){
 G=new vertex[s];
 count=0;
 }
public void AddVertex(String n, int a){
   // n=n.toLowerCase();
    if(count<G.length){
        for(int i=0;i<count;i++){
            if(G[i].name.equals(n)){
                System.out.println("duplicates");
                return;
            }
        }
        G[count++]=new vertex(n,a);
    }
}
public void AddEdge(String n1,String n2) {
    int j=0;
    int i=0;
    for(i=0;i<count;i++){
        if(G[i] !=null && n1.equals(G[i].name)){
               break;
        }
    }
    for(j=0;j<count;j++){
        if(G[j] !=null && n2.equals(G[j].name)){
               break;
        }
    }
    if(i <count && j<count){
        G[j].friendsList.insert(G[i]);
        G[i].friendsList.insert(G[j]);
    }
}
public void deleteVertex(String n){
 
    int i=0;
        for ( i = 0; i < count; i++) {
            if(G[i]!=null && n.equals(G[i].name)){
                //G[i]=null;
            break;
            } 
            
        }
        
        LinkedList<vertex> list=G[i].friendsList;
        int j=0, k=0;
           for ( j = 0; j < list.size; j++) {
                vertex v=list.get(j);
                for(k=0;k<count;k++){
                    if(G[k]!=null && G[k]==v){
                        G[k].friendsList.delete(G[i]);
                        if(G[i] !=null){
                        System.out.println("The vertex "+G[i]+" Is Deleted");}
                        G[i]=null;
                        break;
                    }
                          
                }
                
           }
           
}
public void deleteEdge(String n1,String n2){
    int i,j=0;                        // (v1,v2)
        for ( i = 0; i < count; i++) {
            if(G[i]!=null && n1.equals(G[i].name)){
            break;
            }    
        }
    
        for ( j = 0; j < count; j++) {
            if(G[j]!=null && n2.equals(G[j].name)){
            break;
            }    
        }
        
        if(i<count && j<count){
            G[i].friendsList.delete(G[j]);
            G[j].friendsList.delete(G[i]);
            System.out.println("The edge between "+G[i]+" and "+G[j]+ " are deleted");
        }
}
public vertex FindVertex(String n){
    int j=0;
    for(j=0;j<count;j++){
        if(G[j] !=null && n.equals(G[j].name)){
               break;
    }
    }
    return G[j];
}
public LinkedList<vertex> FindVertexFriendsList(String n){
    int j=0;
        for ( j = 0; j < count; j++) {
            if(G[j]!=null && n.equals(G[j].name)){
            break;
            }    
        }
        if(G[j]!=null){
           return G[j].friendsList;
        }
        return null;
}
 public void DFS(){
      Stack<vertex> stack = new Stack<vertex>();
      vertex v=G[0];
      v.visit=true;
      stack.push(v);
      System.out.print(" "+v.name);
      
      while(!stack.isEmpty()){
          LinkedList<vertex> L=v.friendsList;
          int i=0;
          while(i<L.size && L.get(i).visit !=false){
              i++;
          }
          if(i<L.size && L.get(i).visit == false){
              v=L.get(i);
              v.visit=true;
              v=L.get(i);
              stack.push(v);
              System.out.print(" "+v.name);
          }
          else{
             v=stack.pop();
             //System.out.println();
          }
          //System.out.println();
      }
      System.out.println();
 }
 public void BFS(){
     Queue<vertex> Q=new ArrayDeque<vertex>();
     
     vertex v=G[0];
     v.visit=true;
     Q.add(v);
     System.out.print(" "+v.name);
     
     while(!Q.isEmpty()){
         v=Q.remove();
         LinkedList<vertex> L=v.friendsList;
         for(int i=0;i<L.size;i++){
             v=L.get(i);
             if(v.visit ==false){
                 v.visit=true;
                 Q.add(v);
                 System.out.print(" "+v.name);
             }
         }
     }
     System.out.println();
 }
    @Override
   
    public String toString(){
   // int j=0;
    String str="";
    String str1="";
    for(int j=0;j<G.length;j++){
       // i
        if(G[j] ==null){
            str1=str1 +"[ "+j+" ] "+"null\n";
                    }else{
              str=str+"Name : "+G[j].name+ " -- Friend List: "+ G[j].friendsList.toString()+"\n";
    }
    } 
    System.out.print(str);
    return str;
    }
}

