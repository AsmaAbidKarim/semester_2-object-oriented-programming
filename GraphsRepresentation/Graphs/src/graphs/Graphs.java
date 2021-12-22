/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author DELL
 */
public class Graphs {
    vertex[] G;
 int count;
Graphs(int s){
 G=new vertex[s];
 count=0;
 }
public void AddVertex(String n, int a){
    n=n.toLowerCase();
    if(count<G.length){
        for(int i=0;i<count;i++){
            if(G[i].name.toLowerCase().equals(n)){
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
    @Override
    public String toString(){
    int j=0;
    for(j=0;j<G.length;j++){
        if(G[j] !=null){
              System.out.println("Name : "+G[j].name+" age : "+G[j].age+ " Friend List: "+ G[j].friendsList.toString());
    }
    } 
    return"";
    }
}
