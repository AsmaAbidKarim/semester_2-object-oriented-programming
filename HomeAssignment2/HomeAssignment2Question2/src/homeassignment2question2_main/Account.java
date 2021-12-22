package homeassignment2question2_main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
 class node<T> {
        T data;
        node<T> next;
        Transaction prev = new Transaction();
        node(T d){
            data=d;
        }
        
    }
public class Account<T extends Comparable<T>> {
    //linked list
   node head;
   //initially 6 banks are given
       
   public void insert(String AcNo){ //bigOh=n
       //System.out.println("ho");
      node n=new node(AcNo);
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
   public void search(String Acc) { //bigOh=n
	String sr="";
	node temp=head;
        if (head!=null) {
            while (temp.next!=null && temp.data!=(Acc)) 
		temp=temp.next;
			
        if(temp.data==(Acc)) 
            sr=temp.prev.print();
            System.out.println(sr+"");
			
	}
	
		
	}
  public boolean isEmpty(){ //bigOh=constant
       if(head==null){
         return true;
       }
       else{
           return false;
       }
  }
   public void addTrans(String Acc,int Amount){ //bigOh=n
       //node n=new node(Acc);
       //int v=new node(Amount);
       node temp=head;
       if(head!=null){
           
       while(temp.next!=null && temp.data!=Acc)
           temp=temp.next;
            
           if(Acc==temp.data){
               
               temp.prev.insert(Amount);
               
           }
           else{
               System.out.println("Account does not exist");
           }
       }
       else{
           System.out.println("List Is Empty");
       }
   }
   public void delete(String AcNo){ //bigOh=n
       
       node temp=head; 
        node prev =head;
        while((temp!=null)&&(temp.data!=AcNo)){
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
   public String toString(){ //bigOh=n
   node temp=head;
    //String str2=String.valueOf(data);
    String str="";
    if(head==null){//System.out.println("No Accounts In This Bank");
    return "No Accounts In This Bank";
    }
    else{
        
    while(temp!=null){
        str=str+"\n"+(String.valueOf(temp.data))+temp.prev.print();
        temp=temp.next;
        
    }
    
    //System.out.println();
    return str;}
    }
   
   }
    

