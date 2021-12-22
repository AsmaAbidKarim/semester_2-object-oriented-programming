/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph2;

/**
 *
 * @author DELL
 */
public class Graph2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        graph2 g=new graph2(10);
        graph2 g1=new graph2(10);

        g.AddVertex("A", 45);
        g.AddVertex("B", 23);
        g.AddVertex("C", 30);
        g.AddVertex("D", 67);
        g.AddVertex("E", 90);
        g.AddEdge("A", "B");
        g.AddEdge("A", "C");
        g.AddEdge("C", "D");
        g.AddEdge("B", "D");
        g.AddEdge("B", "E");
        
            g1.AddVertex("A", 45);
        g1.AddVertex("B", 23);
        g1.AddVertex("C", 30);
        g1.AddVertex("D", 67);
        g1.AddVertex("E", 90);
        g1.AddEdge("A", "B");
        g1.AddEdge("A", "C");
        g1.AddEdge("C", "D");
        g1.AddEdge("B", "D");
        g1.AddEdge("B", "E");
        
        g.toString();
        System.out.println("Through BFS");
        g.BFS();
        System.out.println("Through DFS");
        g1.DFS();
        
    }
    
}
