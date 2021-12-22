/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author 19685
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//          for random number
         RecursiveFunction RF = new RecursiveFunction();
         //Numbers are written permenantly in the array
        int Arr[] = {1, 4, 45, 6, -40, 11, 2}; 
        int n = Arr.length; 
        int[] RandomArr;
        
        // Function calling 
        System.out.println("The Minimum Number = "+RF.FindMinRec(Arr,n));
        System.out.println("Count = "+RF.count);
        System.out.println();
        System.out.println("For a Random Array");
        //Random number given in array
        RandomArr = new int[11];
        for(int i=0;i<RandomArr.length;i++){
            RandomArr[i]=(int)(Math.random()*100);
            System.out.print(RandomArr[i]+",");
        }
        System.out.println();
        System.out.println("The Minimum Number = "+RF.FindMinRec(RandomArr,n));
        System.out.println("Count = "+RF.count);
        
    }
    
}
