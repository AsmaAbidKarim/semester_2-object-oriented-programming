/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author DELL
 */
class node<T>{
    T data;
    node next;

    node(T v){
        data=v;
    }
}
    
public class LinkedListbasedPriorityQueue <T extends Comparable<T>>{
    node F;
    node R;
    
//    public void Enqueue(T obj){
//     node temp = F;  
//    
//    // Create new Node  
//    node n = new node(obj);  
//    
//    // Special Case: The head of list has lesser  
//    // priority than new node. So insert new  
//    // node before head node and change head node.  
//    if (F.data> n.data) {  
//        
//        // Insert New Node before head
//        n.next = F;
//        (F) = n;
//    }  
//    else {
//        
//        // Traverse the list and find a
//        // position to insert new node
//        while (temp.next != null && (temp.next.data < n.data) ) {  
//            //obj.compareTo(temp.next.priority)<0
//            temp = temp.next;
//        }
//        
//        // Either at the ends of the list
//        // or at required position
//        n.next = temp.next;
//        temp.next = n;
//    }  
//    }
    public void Enqueue(T obj){
       

        node  n = new node  (obj);
		
			
			if (isEmpty())
			F=n;
			
			else {
				node temp=F;
				while (temp.next!=null && (obj.compareTo((T) temp.data)>0)) {
					temp=temp.next;
				}
				if ((obj.compareTo((T) temp.data)<0) ) {
					n.next=temp;
			         F=n;
				}
				else  {
					temp.next=n;
				}
				
				
			}
    }
   public boolean isEmpty(){
        return (R ==null && F==null);
    
}
   public T Dequeue() {
		 if(!isEmpty()) {
				node temp = F;
				F=temp.next;
				return (T)temp.data;
			}
			else {
				System.out.print("The list is empty!!!");
		    	 return null;
			}
	 }
    
    public T peek(){
        if(isEmpty()){
        System.out.print("The list is empty!!!");
        return null;
        }
        else{
            System.out.println((T)F.data);
        return (T)F.data;}
    }
    public String printQueue(){
    String str="";
	      node temp=F;
	
	     while(temp.next!=null){
	         str= str + temp.data+" , ";
	         temp=temp.next;
	     }
	     System.out.println(str  +temp.data);
	     return str  +temp.data;
    }
}
    

