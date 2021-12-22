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
public class vertex {
 
    String name;
    int age;
    LinkedList<vertex> friendsList= new LinkedList<vertex>();
    vertex(String d, int a){
        name=d;
        age=a;
}
    public String toString(){
        return name;
}
}


