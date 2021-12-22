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
public class AdjMatrixMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g= new Graph(30);
        g.addVertex("Amna", 24);
        g.addVertex("Asma", 43);
        g.addVertex("Amara", 29);
        g.addVertex("Saman", 34);
        g.addVertex("Shayan", 20);
        g.addVertex("Sadaf", 39);
        g.addVertex("Sara", 24);
        g.addVertex("Nasir", 43);
        g.addVertex("Ashfaque", 24);
        g.addVertex("Nadeem", 43);
        g.addVertex("Zahid", 29);
        g.addVertex("Kashif", 19);
        g.addVertex("Faisal", 20);
        g.addVertex("Saeed", 48);
        g.addEdge("Amna", "Amna");
        g.addEdge("Sara", "Saman");
        g.addEdge("Saman", "Faisal");
        g.addEdge("Asma", "Nasir");
        g.addEdge("Faisal", "Amara");
        g.addEdge("Amara", "Faisal");
        g.addEdge("Shayan", "Ashfaque");
        g.addEdge("Ashfaque", "Sara");
        g.addEdge("Amna", "Sadaf");
        g.addEdge("Sara", "Nasir");
        g.addEdge("Saman", "Amna");
        g.addEdge("Asma", "Amara");
        g.addEdge("Shayan", "Nasir");
        g.addEdge("Ashfaque", "Faisal");
         g.addEdge("Zahid", "Amara");
        g.addEdge("Kashif", "Nasir");
        g.addEdge("Nadeem", "Faisal");
        g.addEdge("Nadeem", "Asma");
        g.display();
    }
    
}
