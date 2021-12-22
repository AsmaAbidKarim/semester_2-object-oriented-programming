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
class StackNode<T> {
 T info;
 StackNode<T> next;
 //Constructor
 StackNode(T data){
 info=data;
}
}

public class LinkedListBasedStack<T extends Comparable<T>>{
    StackNode<T> top=null;
    
    public void PUSH(T c){
        StackNode<T> n=new StackNode(c);
        n.next=top;
        top=n;
    }
    public T POP(){
    if(!isEmpty()){
        StackNode<T> temp=top;
        top=top.next;
        return temp.info;
    }
    else{
        System.out.println("underflow");
        return null;
    }
    }
    public Boolean isEmpty(){
        return top==null;
    }
}

