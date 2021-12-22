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
                 int [] arr3=new int[20];
                 int [] arr4=new int[20];
                 int [] arr5=new int[20];
		ExchangeSort s= new ExchangeSort();
                System.out.println("'Sorting By HeapSort'\n");
                System.out.println("Data Before Sorting: ");
                for (int i =0;i<arr5.length;i++) {
			arr5[i]=(int) (Math.random()*100);
                    //arr5[i]=i;
			System.out.print( arr5[i] +",");
		}
		s.HeapSort(arr5 , arr5.length-1);
                System.out.println("\n Data After Sorting: ");
                for(int i=0;i<arr5.length;i++){
                    
                        System.out.print( arr5[i] +",");

                }
                System.out.println("\n Comparisions: "+s.getcomp());
                System.out.println(" Swaps: "+s.swap);

//                System.out.println("Sorting By MergeSort\n");
//                System.out.println("Data Before Sorting: ");
//                for (int i =0;i<arr4.length;i++) {
//			arr4[i]=(int) (Math.random()*100);
//                    //arr4[i]=i;
//			System.out.print( arr4[i] +",");
//		}
//		s.MergeSort(arr4 , 0, arr4.length-1);
//                System.out.println("\n Data After Sorting: ");
//                for(int i=0;i<arr4.length;i++){
//                    
//                        System.out.print( arr4[i] +",");
//
//                }
//                System.out.println("\n Comparisions: "+s.getcomp());
//                System.out.println(" Swaps: "+s.swap);
//		
//                System.out.println("Sorting By BUBBLE Method");
//                System.out.println("Data Before Sorting: ");
//                for (int i =0;i<arr.length;i++) {
//			arr[i]=(int) (Math.random()*100);
//			System.out.print( arr[i] +",");
//		}
//		s.bubble(arr);
//                System.out.println("\n Data After Sorting: ");
//		for(int i =0;i<arr.length;i++){
//                        System.out.print( arr[i] +",");
//                }
//                System.out.println("\n Sorting By SELECTION Method");
//                System.out.println("Data Before Sorting: ");
//                for (int i =0;i<arr1.length;i++) {
//			arr1[i]=(int) (Math.random()*100);
//			System.out.print( arr1[i] +",");
//		}
//		s.selection(arr1);
//                System.out.println("\n Data After Sorting: ");
//                for(int i=0;i<arr1.length;i++){
//                        System.out.print( arr1[i] +",");
//                }
//                System.out.println("\n Sorting By INSERTION Method");
//                System.out.println("Data Before Sorting: ");
//                for (int i =0;i<arr2.length;i++) {
//			arr2[i]=(int) (Math.random()*100);
//			System.out.print( arr2[i] +",");
//		}
//		s.insertion(arr2);
//                System.out.println("\n Data After Sorting: ");
//                for(int i=0;i<arr2.length;i++){
//                        System.out.print( arr2[i] +",");
//
//                }
//                System.out.println("\n Sorting By QUICKSORT");
//                System.out.println("Data Before Sorting: ");
//                for (int i =0;i<arr3.length;i++) {
//			arr3[i]=(int) (Math.random()*100);
//                    //arr3[i]=i;
//			System.out.print( arr3[i] +",");
//		}
//		s.quickSort(arr3 , 0, arr3.length-1);
//                System.out.println("\n Data After Sorting: ");
//                for(int i=0;i<arr3.length;i++){
//                    
//                        System.out.print( arr3[i] +",");
//
//                }
//                System.out.println("\n Comparisions: "+s.getcomp());
//                System.out.println(" Swaps: "+s.swap);
                
    }
    
}
