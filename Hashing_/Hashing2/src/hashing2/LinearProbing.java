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
public class LinearProbing {
       String[] Table;
       int numcoll=0;
       int L=0;
       int numOccupied=0;
 LinearProbing(int s){
     int size =s+(s/3);
     int newSize=getPrime(size);
     L=newSize;

 Table=new String [newSize];
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
 public int Hash(int key){
 //compute hash value by taking mod on sum value
     return key%Table.length;
 }
 public int QuadraticRehash(int key, int i){
 // first test linear probing on whole dictionary words, then Quadratic probing and
 // understand the changes in number of collisions in each method
     return (key+(i+i))%Table.length;
 }
 public int LinearRehash(int key, int i){
 // first test linear probing on whole dictionary words, then Quadratic probing and
 // understand the changes in number of collisions in each method
     return (key+i)%Table.length;
 }
 public void insert(String key){
 // call Hash(key) and save return hash value
 // if (no collision on hash value) then place
 //else call rehash function until empty cell found
 // also compute number of collisions on each key insertion
     int sum=strToInt(key);
     L=Table.length;
     int h=Hash(sum);
     if( numOccupied < (L*0.7)){
     if(Table[h]==null){
         Table[h]=key;
         numOccupied++;
     }
     else{
         int j=1;
        // int c=0;
         while(j<11 && Table[h]!=null){
            //h=LinearRehash(sum,j);
             h=QuadraticRehash(sum,j);
            j++;
            numcoll++;
            System.out.println("collision =  "+numcoll+" for key "+key);
         }
         if(Table[h]==null){
             Table[h]=key;
             numOccupied++;
             //System.out.println("collision= "+c+"for key "+key);
         }
         else{
             System.out.println("No Space");
         }
     }
 }}
     
 int strToInt(String Key){
    int sum=0;
    for(int i=0;i<Key.length();i++){
        sum=sum+Key.charAt(i);
    }
    return sum;
}
  public void Iinsert(String key){
 // call Hash(key) and save return hash value
 // if (no collision on hash value) then place
 //else call rehash function until empty cell found
 // also compute number of collisions on each key insertion
     int sum=strToInt(key);
     L=Table.length;
     int h=Hash(sum);
     if( numOccupied < (L*0.7)){
     if(Table[h]==null){
         Table[h]=key;
         numOccupied++;
     }
     else{
         int j=1;
        // int c=0;
         while(j<11 && Table[h]!=null){
            //h=LinearRehash(sum,j);
             h=LinearRehash(sum,j);
            j++;
            numcoll++;
            System.out.println("collision count =  "+numcoll+" at["+h+"] for key "+key);
         }
         if(Table[h]==null){
             Table[h]=key;
             numOccupied++;
             //System.out.println("collision= "+c+"for key "+key);
         }
         else{
             System.out.println("No Space");
         }
     }
 }}
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
