package lab11;

public class Queue <T extends Comparable<T>>{
	 T[] Q;
	 int F;
	 int l=-1;
	 Queue(){
	 Q=(T[])new Comparable[10];
	 F=-1;
	 }
	 
	 Queue(int size){
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
			boolean b = false;
			int c=-1;		
			for(int i=0;Q[i]!=null;i++) {			
				if(obj.compareTo(Q[i])>0) {
				count=i;
				b=true;
				break;
				}
					c=i;
			}
			if (b) {
			for (int i=Q.length-1;i>count;i--) 
				Q[i]=Q[i-1];
			Q[count]=obj;
			}
			else Q[c+1]=obj;
		 }
		 else System.out.println("Sorry! The list is full.");		 
	 } 
		 
	 public T Dequeue() { 
		 if (isEmpty()) {
			 System.out.println("Sorry! The list is empty.");
			 return null;
		 }
		 else {
		 Object o = new Object();
		 o=Q[F];
		 Q[F]=null;
		 F--;
		 return (T) o;
		 }
	 }
		 
	 public boolean isEmpty() {
		 return (F==-1);
	 }
	 public boolean isFull(){
		 return(Q[Q.length-1]!=null);
	 }
	 
	 public T peek(){
		 if (isEmpty()) {
			 System.out.println("Sorry! The list is empty.");
			 return null;
		 }
		 else
		 return Q[F];
	 }
	 public String toString() {
		 String s= "";
		 if (!isFull()) {
		 for (int i = 0;Q[i]!=null;i++) {
				s=s+  Q[i]+" " ;			 
		 }	  
			 return s;
	 }
	 else {
		 for (int i = 0;i<Q.length;i++) {
					s=s+  Q[i]+" " ;					 
			 }			  
				 return s;
	 }
	 }
	 
}
