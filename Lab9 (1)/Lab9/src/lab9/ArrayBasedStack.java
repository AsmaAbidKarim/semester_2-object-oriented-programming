/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author 19685
 */
public class ArrayBasedStack <T extends Comparable<T>> {
 T stackList[];
 int top;
// constructor
 ArrayBasedStack (int size){
 stackList=(T[]) new Comparable[size];
}
 public void PUSH(T c){
     if(!isFull()){
         top++;
         stackList[top]=c;
         
     }
     else{
         System.out.println("overflow");
     }
 } 
 public T POP(){
 if(!isEmpty()){
     top--;
     return (stackList[top+1]);
 }
 else{
     System.out.println("underflow");
     return null;
 }
 
 }
 public Boolean isEmpty(){
     return(top==-1);
 }
 public Boolean isFull(){
     return (top==stackList.length-1);
 }
}
 
