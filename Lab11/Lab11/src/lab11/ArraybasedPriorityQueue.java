/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author DELL
 * @param <T>
 */
public class ArraybasedPriorityQueue <T extends Comparable<T>>{
    T[] Q;
 int F;
ArraybasedPriorityQueue(){
 Q=(T[])new Comparable[10];
 F=-1;
 }
 ArraybasedPriorityQueue(int size){
 Q=(T[])new Comparable[size];
 F=-1;
 }
public void Enqueue(T obj){

   if (isEmpty()) {
			 Q[0]=obj;
			 F++;			
		 }
		 else if(!isFull()) {
                        F++;
                        int count = -1; 
			boolean temp = false;
			int c=-1;		
			for(int i=0;Q[i]!=null;i++) {			
				if(obj.compareTo(Q[i])>0) {
				count=i;
				temp=true;
				break;
				}
					c=i;
			}
			if (temp) {
			for (int i=Q.length-1;i>count;i--) 
				Q[i]=Q[i-1];
			Q[count]=obj;
			}
			else Q[c+1]=obj;
		 }
		 else System.out.println("The list is full!!!");
}
public T Dequeue(){
    if (isEmpty()) {
			 System.out.println("The list is empty!!!");
			 return null;
		 }
		 else {
                    Object temp = new Object();
                    temp=Q[F];
                    Q[F]=null;
                    F--;
                    return (T) temp;
		 }
}
public boolean isEmpty(){
       return F == -1;
}
public boolean isFull(){
 return(Q[Q.length-1]!=null);
}
public T peek(){
   if (isEmpty()) {
			 System.out.println("The list is empty!!!!");
			 return null;
		 }
		 else
		 return Q[F];
}
    
    public void print() {
    if(!isEmpty()){
//        for(int i=0;i<=Q.length-1;i++){
//            System.out.print(Q[i]+",");
//        }
        for(int i=0;i<=Q.length-1;i++){
            System.out.println("Q["+i+"] :"+ Q[i]+",");
        }
    }
   else{
        System.out.println("Queue Is Empty");
    }
}
}
