/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangesort;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class ExchangeSortmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
		int [] arr = new int [20];
                int [] arr1 = new int [20];
                 int [] arr2 = new int [20];
		ExchangeSort s= new ExchangeSort();
		
                System.out.println("Sorting By BUBBLE Method");
                System.out.println("Data Before Sorting: ");
                for (int i =0;i<arr.length;i++) {
			arr[i]=(int) (Math.random()*100);
			System.out.print( arr[i] +",");
		}
		s.bubble(arr);
                System.out.println("\n Data After Sorting: ");
		for(int i =0;i<arr.length;i++){
                        System.out.print( arr[i] +",");
                }
                System.out.println("\n Sorting By SELECTION Method");
                System.out.println("Data Before Sorting: ");
                for (int i =0;i<arr1.length;i++) {
			arr1[i]=(int) (Math.random()*100);
			System.out.print( arr1[i] +",");
		}
		s.selection(arr1);
                System.out.println("\n Data After Sorting: ");
                for(int i=0;i<arr1.length;i++){
                        System.out.print( arr1[i] +",");
                }
                System.out.println("\n Sorting By INSERTION Method");
                System.out.println("Data Before Sorting: ");
                for (int i =0;i<arr2.length;i++) {
			arr2[i]=(int) (Math.random()*100);
			System.out.print( arr2[i] +",");
		}
		s.insertion(arr2);
                System.out.println("\n Data After Sorting: ");
                for(int i=0;i<arr2.length;i++){
                        System.out.print( arr2[i] +",");

                }
    }
}
