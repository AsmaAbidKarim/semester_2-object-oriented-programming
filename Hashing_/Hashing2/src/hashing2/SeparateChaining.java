/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing2;

/**
 *
 * @author DELL
 */

public class SeparateChaining<T extends Comparable<T>>{
   LinkedList<T>[] Table;
   int numcoll=0;
       int L=0;
       int numOccupied=0;
    
    SeparateChaining(int s){
         int size =s+(s/3);
     int newSize=getPrime(size);
     L=newSize;
        Table=new LinkedList[newSize];
        System.out.println("size= "+s+" newsize = "+newSize);
        
    }
    private int getPrime(int n){
     while(true){
         if(isPrime(n)) return n;
         n++;
     }
 }
 private boolean isPrime(int n){
     for(int i=2;i<=n/2;i++){
         if(n%i ==0) return false;
     }
     return true;
 }
    int strToint(T key){
        int sum=0;
        String str=key.toString();
        for (int i = 0; i < str.length(); i++) {
            sum=sum+str.charAt(i);
        }
        return sum;
     }
    public int hash(int s){
          return s%Table.length;
    }
    public void insert(T key){
       int sum=strToint(key);
       
       int h=hash(sum);
       
       if(Table[h]==null){
         Table[h]=new LinkedList();
       }
       Table[h].insert(key);
     }
    
    public boolean search (int key) {    
          // search word in a hash table   
          return false;
     }  
     public boolean delete (int key) {     
         // delete word from hash table   
         return false;
     }
     public void displayTable() { 
         
         for (int i = 0; i < Table.length; i++) {
             if(Table[i]==null){
               System.out.println("["+i+"] "+Table[i]);
             }
             else{
             System.out.println("["+i+"] "+Table[i].toString());
         }
         }
        }
           
}

