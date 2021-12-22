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
public class QueueArrayBase<T> {
    T[] Q;
    int F; 
    int R;
//Constructor
 QueueArrayBase(){
 Q=(T[])new Object[10];
 F=9; R=9;
 }
// Constructor
 QueueArrayBase(int size){
 Q=(T[])new Object[size];
 F=size-1; R=size-1;
}
public void Enqueue(T obj){
    if(!isFull()){
        R=(R+1)%Q.length;
        Q[R]=obj;
    }
    else{
        System.out.println("OverFlow");
    }
 }
public T Dequeue(){
    if(!isEmpty()){
        F=(F+1)%Q.length;
        return Q[F];
    }
    else{
        System.out.println("UnderFlow");
    return null;
    }
}
public boolean isEmpty(){ 
    return R==F;
}
public boolean isFull(){
    return ((R+1)%Q.length)==F;
}
public void printQueue(){
    int i=(F+1)%Q.length;
    for(; i!=R; i=(i+1)%Q.length){
        System.out.println("Q["+i+"]"+Q[i]);
}
    System.out.println("Q["+i+"]"+Q[i]);
}
}// class end