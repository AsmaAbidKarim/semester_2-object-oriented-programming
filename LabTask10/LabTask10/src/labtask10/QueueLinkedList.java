/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask10;

/**
 *
 * @author DELL
 */
class node<T>{
T data;
node<T> next;
//constructor
    node(T v){
        data=v;
    }

}
public class QueueLinkedList<T> {
    node<T> Front;
    node<T> Rear;
public void Enqueue(T obj){
    node<T> n= new node(obj);
    if(isEmpty()){
        Front=n;
        Rear=n;
    }
    else{
        Rear.next=n;
        Rear=n;
    }
}
public T Dequeue(){
    node<T> temp=Front;
    if(!isEmpty()){
        if(Front == Rear){
            Rear=Rear.next;
        }
        Front=Front.next;
        return temp.data;
    }
    else{
        System.out.println("UnderFlow");
        return null;
    }
}
public boolean isEmpty(){
        return (Rear ==null && Front==null);
    
}
public String printQueue(){
    if(!isEmpty()){
        String str="";
        node<T> temp=Front;
        while(temp != Rear){
            str=str+(temp.data+",");
            temp=temp.next;
        }
        return str+Rear.data;
    }
    else{
    return"Underflow";
    }
}
}
