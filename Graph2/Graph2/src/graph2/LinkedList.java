/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph2;

/**
 *
 * @author DELL
 */
class node<T>{
   T data;
   node<T> next;
   
   node(T v){
    data=v;         
    //next=null;     
   }
}
public class LinkedList<T> {
    node head;
    int size=0;
    public void insert(T v){
       size++;
       node n=new node(v);
       if (head==null){
       head=n;
       }
       else{
       node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=n;
       }     
       
    }
    
    public void delete(T d){
      node<T> temp=head, prev=head;
     
      while(temp!=null && temp.data!=(d)){
          temp=temp.next;
    }
     if (temp==null){
         //System.out.println("not fount to delete node");
     }
     else if(temp==head){
           head=head.next;
      }
     else {
         prev.next=temp.next;
     }
         
    }
    public T get(int i){
		int j=0;
		node<T> temp=head;
		while(j<i && temp.next!=null){
			temp=temp.next;
			j++;
		}
		return temp.data; 
	}
	public int getsize(){
		return size;
	}
    @Override
    public String toString(){
       String str="";
       node temp=head;
       
       while(temp!=null){ 
           
         str=str+temp.data.toString()+", ";
         temp=temp.next;
       }
       return str;
    }
 
    public boolean find (String v){
        return false;}
}
