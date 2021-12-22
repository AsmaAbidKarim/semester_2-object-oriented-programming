/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2question2_main;

/**
 *
 * @author DELL
 */
 class Node1<T> {
        T data;
        Node1<T> next;
        Node1(T d){
            data=d;
        }
        
    }
public class Transaction{
 
   Node1 head;
    
public void insert(int trans){  ////bigOh=constant
 Node1 n=new Node1(trans);
        if(head==null){   
           head=n;
           //System.out.print(head.data);
        }
        else{
            Node1 temp=head;
            while(temp.next!=null){
            
            temp=temp.next;}
            temp.next=n;
           //big o order N
        }   
}
public Boolean search(int trans){ ////bigOh=n
    Node1 temp=head;
    if(head==null){System.out.println("Link list in Null");}
    else {
        while(temp!=null){
        if(trans == (int)temp.data){ 
        System.out.println("Number " +trans+" is present");return true; }
        else {temp=temp.next;}
        }
    } 
    System.out.println("Number does not exists in the list");
    return false;
}
public void delete(int trans){  //bigOh=n
    Node1 temp=head; 
        Node1 prev =head;
        while((temp!=null)&&(temp.data!=(Object)trans)){
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
public void clear(){ // code //bigOh=constant
        head =null;
        //System.out.print("List is cleared");
    }
   public String print(){ //bigOh=n
   Node1 temp=head;
    //String str2=String.valueOf(data);
    String str="";
    if(head==null){//System.out.println("Head is Null and the list is cleared");
    return str;
    }
    else{
    while(temp.next!=null){
        str=str+temp.data+",";
        temp=temp.next;
    }
    //System.out.println("");
    return "[ TRANSACTION OF Account = Rs: "+str+" "+temp.data+" ]";
    }}
   
} 

