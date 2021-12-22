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
public class vertex {
 
   String name;
    int age;
    boolean visit;
    LinkedList<vertex> friendsList= new LinkedList<vertex>();
    vertex(String d, int a){
        name=d;
        age=a;
}
   @Override
    public String toString(){
        return name;
}
} // end class Vertex