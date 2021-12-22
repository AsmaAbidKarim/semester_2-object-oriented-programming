/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjmatrix;

/**
 *
 * @author DELL
 */
public class Graph {
    
    vertex vertexList[]; // array of vertices
 int adjMat[][];
 int count=0;
// adjacency matrix
 Graph(){
 vertexList=new vertex[10];
 adjMat=new int[10][10];
}
Graph(int s){
 vertexList=new vertex[s];
 adjMat=new int[s][s];
}
public void addVertex(String L , int a) {
    vertex v=new vertex(L,a);
    if(count<vertexList.length)
        vertexList[count++]=v;
    else
        System.out.println("list full");
}
public void addEdge(String L1, String L2) {
    int i,j;
    for(i=0;i<count;i++){
        if(vertexList[i] !=null && L1.equalsIgnoreCase(vertexList[i].label))
                break;
    }
    for(j=0;j<count;j++){
        if(vertexList[j] !=null && L2.equalsIgnoreCase(vertexList[j].label))
                break;
    }
    adjMat[i][j]=1;
    adjMat[j][i]=1;
    
}
public void display() {
    for(int i=0;i<count ;i++){
        System.out.println("["+i+"]"+vertexList[i].label);
        for(int j=0;j<count;j++){
            if(adjMat[i][j]==1){
                System.out.println("        "+"==>"+vertexList[j].label);
            }
        }
    }
}    
}
