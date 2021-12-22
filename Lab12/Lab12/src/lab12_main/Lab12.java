/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_main;

/**
 *
 * @author DELL
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST B1=new BST();
        BST B2=new BST();
        B1.insert(10);
        B1.insert(16);
        B1.insert(7);
        B1.insert(3);
        B1.insert(90);
        B1.traverse(B1.root);
        System.out.println();
        B1.find(90);
        B1.find(0);
        
    }
    
}
