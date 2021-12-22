/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask13;

/**
 *
 * @author DELL
 */
public class LabTask13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BST<Integer> B1=new BST();
//        //BST B2=new BST();
//        B1.insert(10);
//        B1.insert(16);
//        B1.insert(7);
//        B1.insert(3);
//        B1.insert(90);
//        B1.delete(90);
//        System.out.println();
//       B1.traverse();
//        B1.find(90);
//        B1.find(0);
//        B1.delete(90);
//        B1.traverse();
//        
        ArrayBST<Integer> B2=new ArrayBST(16);
        B2.insert(10);
        B2.insert(16);
        B2.insert(7);
        B2.insert(30);
        B2.insert(90);
        B2.traverse();
        B2.find(0);
        B2.delete(90);
        B2.traverse();
       
}
    }
    

