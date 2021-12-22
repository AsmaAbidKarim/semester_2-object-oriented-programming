/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author DELL
 */
public class QuadraticProbing {
       int[] Table;
 QuadraticProbing(int s){
     int prime=1;
     if(isPrime(s)) 
         prime=s;
     else
         prime=getPrime(s);
     s=prime;
//size=prime
     int size =s+(s/3);
 Table=new int [s+(s/3)];
 // table size should be a prime number and 1/3 extra.
 for(int i=0;i<size;i++){
     Table[i]=-1;
 }
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
 public int Hash(int key){
 //compute hash value by taking mod on sum value
     return key%Table.length;
 }
 public int QuadraticRehash(int key, int i){
 // first test linear probing on whole dictionary words, then Quadratic probing and
 // understand the changes in number of collisions in each method
     return (key+i)%Table.length;
 }
 public void insert(int key){
 // call Hash(key) and save return hash value
 // if (no collision on hash value) then place
 //else call rehash function until empty cell found
 // also compute number of collisions on each key insertion
     int h=Hash(key);
     if(Table[h]==-1){
         Table[h]=key;
     }
     else{
         int j=1;
         int c=0;
         while(c<=Table.length && Table[h]!=-1){
            h=QuadraticRehash(key,j);
            j=j*j;
            c++;
         }
         if(Table[h]==-1){
             Table[h]=key;
             System.out.println("collision= "+c+"for key "+key);
         }
         else{
             System.out.println("No Space");
         }
     }
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
 // display hash table
     for(int i=0;i<Table.length;i++){
         System.out.println("["+i+"]"+Table[i]);
     }
 }
}
