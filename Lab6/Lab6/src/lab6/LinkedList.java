/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
class node{
    int data;
    node next;
    node(int v){
        
        data=v;
        //next=null
    }}
    

public class LinkedList {
    node head;
    public void insert(int v){
        node n=new node(v);
        if(head==null){   
           head=n;
            
            
        }
        else{
            node temp=head;
            while(temp.next!=null){
            
            temp=temp.next;}
            temp.next=n;
           //big o order N
        }
    
    }
    public Boolean find(int v){ // code 
    node temp=head;
    if(head==null){System.out.println("Link list in Null");}
    else {
        while(temp!=null){
        if(v==temp.data){ 
        System.out.println("Number " +v+" is present");return true; }
        else {temp=temp.next;}
        }
    }
    System.out.println("Number does not exists in the list");
    return false;
    }

    public void clear(){ // code 
        head =null;
        //System.out.print("List is cleared");
    }
    public void delete(int d){ // code
        node temp=head; 
        node prev =head;
        while((temp!=null)&&(temp.data!=d)){
        prev=temp;
        temp=temp.next;
        }
        if(temp==head){
        head=temp.next;}  // first element
        else if(temp.next==null){
            temp=null;
        } //last
        else{
            prev.next=temp.next;
        } //middle element
    }

    @Override
    public String toString(){ // code 
    node temp=head;
    //String str2=String.valueOf(data);
    String str="";
    if(head==null){System.out.println("Head is Null and the list is cleared");
    return str;
    }
    while(temp!=null){
        str=str+(String.valueOf(temp.data))+",";
        temp=temp.next;
    }
    System.out.println(str);
    return str;
    }
}
