/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_main;

/**
 *
 * @author DELL
 */
class node<T> {
 T data;
 node<T> left;
 node<T> right;

 node(T d){
 data=d;
 }
}
public class BST<T extends Comparable<T>> {

 node<T> root;
public void insert(T key){  // insert key in a tree
    node n=new node(key);
    if(root==null){
        root=n;
    }
    else{
        node temp=root;
        node temp2=root;
        while(temp!=null){
            temp2=temp;
            //Object k=(T)temp.data;
            if(key.compareTo((T)temp.data)<0){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
            if(key.compareTo((T)temp2.data)<0){
                temp2.left=n;
            }
            else{
                temp2.right=n;
            }
        
    }
}
public void traverse(node n) { // print tree
 if(n==null){}
 else{
     traverse(n.left);
     System.out.print(n.data+" , ");
     traverse(n.right);}
 }
 

public node find(T key){ // find key in a tree
    node n=new node(key);
    node<T> temp=root;
    while(temp!=null && key.compareTo(temp.data)!=0){
        if(key.compareTo(temp.data)<0){
            temp=temp.left;
        }
        else{
            temp=temp.right;
        }
    }
    if(temp==null){
        System.out.println("The node "+key+" is NOT found");
        return null;
    }
    else{
        System.out.println("The node "+key+" is found");
        return temp;
    }
    
} 
}
