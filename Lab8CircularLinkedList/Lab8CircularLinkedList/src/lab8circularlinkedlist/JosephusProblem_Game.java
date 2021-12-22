/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8circularlinkedlist;

/**
 *
 * @author DELL
 */
class node{
    String player;
    node next;
    node(String v){
        
        player=v;
        //next=null
    }}

public class JosephusProblem_Game {
    node head;
    public void insert(String player){
        node n =new node(player);
        if(head==null){
            head=n;
            head.next=n;
        }
        else{
            //next player is alway added 
            //on second position after head
            
            n.next=head.next;
            head.next=n;
            
        }
        }
    public String PlayGame(){
        while(head.next!=head){
            node temp=head;
            node prev =head;
            //the tranfer occer for random time 
            //if random is equal to 6 loop travels 6 times not 5
            int random=(int) (Math.random() * 20 + 1);
            for(int i=0;i<random;i++){
                prev=temp;
                temp=temp.next;
            }
            delete(prev,temp);
        }
       
       System.out.println("The WInner Is "+head.player);
        return head.player;
    }
    public void delete(node prev,node temp){
       
           prev.next=temp.next;
           head=prev.next;
            
    }
    @Override
    public String toString(){
        node temp=head;
        String str="";
        while(temp.next!=head){
            str=str+temp.player+", ";
            temp=temp.next;
        }
        return str+temp.player;
    }
    }

