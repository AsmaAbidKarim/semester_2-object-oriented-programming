/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptree;

/**
 *
 * @author DELL
 */
public class HeapTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeapTreeSorting<Integer> HTS=new HeapTreeSorting(10);
        System.out.println("Array After Insertion");
        HTS.Insert(45);
        HTS.Insert(20);
        HTS.Insert(23);
        HTS.Insert(27);
        HTS.Insert(29);
        HTS.Insert(41);
        HTS.Insert(39);
        HTS.Insert(40);
        HTS.print();
        //Integer[] arr={12,56,99,78,67,45,89,90,783,65,34};
        System.out.println();
        System.out.println("Array After Formin Max Heap");
       HTS.buildMaxHeap(); 
       HTS.print();
       HTS.ReHeap();
       System.out.println("Array After Deletion");
       HTS.delete();
       System.out.println();
       HTS.print();
       
       
    }
    
}
