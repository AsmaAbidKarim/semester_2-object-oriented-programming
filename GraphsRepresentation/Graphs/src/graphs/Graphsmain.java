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
public class Graphsmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graphs g=new Graphs(20);
        g.AddVertex("amna", 24);
        g.AddVertex("asma", 43);
        g.AddVertex("amara", 29);
        g.AddVertex("saman", 34);
        g.AddVertex("shayan", 20);
        g.AddVertex("sadaf", 39);
        g.AddVertex("sara", 24);
        g.AddVertex("nasir", 43);
        g.AddVertex("ashfaque", 24);
        g.AddVertex("nadeem", 43);
        g.AddVertex("zahid", 29);
        g.AddVertex("kashif", 34);
        g.AddVertex("faisal", 20);
        g.AddVertex("saeed", 39);
        g.AddEdge("amna", "nasir");
        g.AddEdge("sara", "saman");
        g.AddEdge("saman", "faisal");
        g.AddEdge("asma", "nasir");
        g.AddEdge("faisal", "Amara");
        g.AddEdge("amara", "faisal");
        g.AddEdge("shayan", "ashfaque");
        g.AddEdge("ashfaque", "sara");
        g.AddEdge("amna", "sadaf");
        g.AddEdge("sara", "nasir");
        g.AddEdge("saman", "amna");
        g.AddEdge("asma", "amara");
        g.AddEdge("shayan", "nasir");
        g.AddEdge("ashfaque", "faisal");
        System.out.println("Record without deletion");
        g.toString();
       g.deleteEdge("sadaf", "amna");
        g.deleteEdge("faisal", "amara");
        g.deleteVertex("amna");
        System.out.println("\n Record After deletion of Vertex and Edge");
        g.toString();
        
         
    }
    
}
