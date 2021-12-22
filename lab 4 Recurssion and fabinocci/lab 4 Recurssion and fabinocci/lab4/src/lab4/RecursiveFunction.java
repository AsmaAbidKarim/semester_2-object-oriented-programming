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
public class RecursiveFunction {
    // function to return minimum element using recursion 
    public static int count;
    public int FindMinRec(int Arr[], int n) 
    {
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return Arr[0]; 
        //  Math.min(n, n)is used here
      count++;
      return Math.min(Arr[n-1], FindMinRec(Arr, n-1)); 
    } 
    
   
}
