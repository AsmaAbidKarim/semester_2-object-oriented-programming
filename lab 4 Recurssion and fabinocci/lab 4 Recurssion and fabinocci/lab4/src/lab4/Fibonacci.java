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
public class Fibonacci {
    public static int count=0;
    int[] knownF=new int[1000];
    public int F(int n){
    if(knownF[n]!=0)        
        return knownF[n];       
    else if (n==0||n==1)     
         return n;
    count++;
    knownF[n]=F(n-1)+F(n-2);  
    return knownF[n];
    }
     public static void main(String[] args) {
   
       Fibonacci Fb=new Fibonacci();
       //random number is given to function F
       System.out.println("Result Of Fibonacci = "+Fb.F((int)(Math.random()*10)));
       System.out.println("Count = "+count);
       System.out.println("Result Of Fibonacci = "+Fb.F((int)(Math.random()*100)));
       System.out.println("Count = "+count);
    }
}

