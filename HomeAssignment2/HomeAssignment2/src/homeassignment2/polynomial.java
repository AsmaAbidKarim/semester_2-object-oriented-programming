/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2;

/**
 *
 * @author DELL
 */
class node {
    int coefficient;
    int power;
    node next;
    public node(int c, int p){
        coefficient=c;
        power=p;
    }
}
class polynomial {

 node head;

public void clear(){ // code 
        head =null;
        //System.out.print("List is cleared");
    } 
//sort the coming terms in order of power
public void insert(int d,int p) {
    node temp=head;
    node prev=head;
    node n=new node(d,p);
    if(head==null)
    {
            //node temp=head;
            head=n;
            n.next=temp;
            
    }
   else{    prev=null;
            while(temp !=null &&temp.power  >p){
            
                prev=temp;
                temp=temp.next;
            
                }
            if(temp==head && p>temp.power){
            //temp=head.power;
            head=n;
            n.next=temp;
            }
            else if(head==temp){
                head=temp;
                n.next=temp;
             }
            else {
                prev.next=n;
                n.next=temp;
            }
        
        }

            }
public void addition( polynomial p1, polynomial p2){
 // code here
   
    node tempp1=p1.head;
    node tempp2=p2.head;
    //polynomial are equal
    int equal1=tempp1.power;
     int equal2=tempp2.power;
    
    while(tempp2.next!=null){
        tempp2=tempp2.next;
        if(equal2<tempp2.power){
            equal2=tempp2.power;
        }

    }
    while(tempp1.next !=null){
        tempp1=tempp1.next;
        if(equal1<tempp1.power){
            equal1=tempp1.power;
        }
        
        
    }
    //p1 is higher degree polynomial
    if(equal1 > equal2){
        tempp1=p1.head;
        tempp2=p2.head;
    while(tempp1!=null){
        if(tempp1.power==tempp2.power){
            insert(tempp1.coefficient+tempp2.coefficient,tempp1.power);
            tempp2=tempp2.next;
            tempp1=tempp1.next;
        }
        else{
           insert(tempp1.coefficient,tempp1.power); 
           tempp1=tempp1.next;
        }
        
    }
}
    //p2 is higher degree polynomial
    else if(equal1 < equal2){
        tempp1=p1.head;
        tempp2=p2.head;
    while(tempp2!=null){
        if(tempp2.power==tempp1.power){
            insert(tempp1.coefficient+tempp2.coefficient,tempp1.power);
            tempp1=tempp1.next;
           tempp2=tempp2.next;
        }
        else{
           insert(tempp2.coefficient,tempp2.power); 
           tempp2=tempp2.next;
        }
        
    }
}
    // p1 p2 is same degree polynomial
    else if(equal1==equal2)
    {   tempp1=p1.head;
        tempp2=p2.head;
        if(p1.head.power==p2.head.power){
        insert(p1.head.coefficient+p2.head.coefficient,p1.head.power);}
        node temp=head;
        while(tempp1.next!=null && tempp2.next!=null){
            
            //temp=temp.next;
            tempp1=tempp1.next;
            tempp2=tempp2.next;
            if(tempp1.power==tempp2.power){
                insert(tempp1.coefficient+tempp2.coefficient,tempp1.power);
            }
        }
    }
    //if p1 is empty
    else if(p1.head==null){
        insert(p2.head.coefficient,p2.head.power);
        while(tempp2!=null){
        tempp2=tempp2.next;
        insert(tempp2.coefficient,tempp2.power);
        }
    }
    //if p2 is empty
     else if(p2.head==null){
         insert(p1.head.coefficient,p1.head.power);
        while(tempp1!=null){
        tempp1=tempp1.next;
        insert(tempp1.coefficient,tempp1.power);
        }
    }
    else{
    System.out.println("Both the List Are Empty");
    }
}
public void displayEquation() { // code here 
    node temp=head.next;
    if(head !=null){
       System.out.print(head.coefficient+"x^"+head.power);
       if(head.next.coefficient>0){ System.out.print("+");}
        while(temp != null) 
        { 
            System.out.printf("%dx^%d", temp.coefficient, temp.power); 
            temp = temp.next; 
            if(temp != null)
                if(temp.coefficient >= 0){
                System.out.print("+"); }
            
       }  
    }
    else{
        System.out.println("The List Is Empty!!!");
    }
    System.out.println();
}
}

