/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.task.pkg14;

/**
 *
 * @author DELL
 */
public class LabTask14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InBinaryTree BST1,BST2;
        BST1= new ArrayBinaryTree(); 
        BST2= new LinkedBinaryTree();
        
       System.out.println("Array based Implemetation");
        BST1.insert(40);
        BST1.insert(58);
        BST1.insert(34);
        BST1.insert(27);
        BST1.insert(33);
        BST1.insert(79);
        BST1.insert(72);
        BST1.insert(99);
        BST1.insert(10);
        BST1.traverse("LNR");
        BST1.find(10);
        BST1.find(0);
         System.out.println();
         System.out.println("Delete Method:Binary tree After Deleting 99");
       BST1.delete(99);
        BST1.traverse("LNR");
        System.out.println("\n"+"The Height Is: "+BST1.height());
        System.out.println("CountLeaf Is: "+BST1.countleaf());
        System.out.println();
        System.out.println("Linked List based Implemetation");
       BST2.insert(40);
        BST2.insert(58);
        BST2.insert(34);
        BST2.insert(27);
        BST2.insert(33);
        BST2.insert(79);
        BST2.insert(72);
        BST2.insert(93);
        BST2.insert(99);
        BST2.traverse("LNR");
        System.out.println();
        BST2.find(90);
        BST2.find(93);
        System.out.println("Delete Method:Binary tree After Deleting 99");
        BST2.delete(99);
        BST2.traverse("LNR");
        System.out.println("\n"+"The Height Is: "+BST2.height());
        System.out.println("CountLeaf Is: "+BST2.countleaf());
    }
    
}
