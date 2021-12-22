/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author DELL
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SearchAlgorithm S=new SearchAlgorithm();
        int[] MyArr=new int [25000];
        for(int i=0;i<MyArr.length;i++){
            MyArr[i]=i;
        }
        long start= System.nanoTime();
        S.LinearSearch(MyArr,-2);
        long end = System.nanoTime();
        System.out.println("Linear search Time, "+(end-start));
        
        long startB=System.nanoTime();
        S.BinarySearch(MyArr, -1);
        long endB=System.nanoTime();
        System.out.println("Binary search Time, "+(endB-startB));
        
       
        
    }
    
}
