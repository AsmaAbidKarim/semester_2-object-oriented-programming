/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.task.pkg14;

/**
 *
 * @author DELL
 * @param <T>
 */
public class LinkedBinaryTree <T extends Comparable<T>>  implements  InBinaryTree<T>{
    
    node<T> root;
    @Override
    public void insert(T d){
     node n=new node(d);
    if(root==null){
        root=n;
    }
    else{
        node temp=root;
        node temp2=root;
        while(temp!=null){
            temp2=temp;
            //Object k=(T)temp.data;
            if(d.compareTo((T)temp.data)<0){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
            if(d.compareTo((T)temp2.data)<0){
                temp2.left=n;
            }
            else{
                temp2.right=n;
            }
        
    }
    }
    
    
    @Override
    public int find(T d){ 
        //node n=new node(d);
    node<T> temp=root;
    while(temp!=null && d.compareTo(temp.data)!=0){
        if(d.compareTo(temp.data)<0){
            temp=temp.left;
        }
        else{
            temp=temp.right;
        }
    }
    if(temp==null){
        System.out.println("The node "+d+" is NOT found");
      
    }
    else{
        System.out.println("The node "+d+" is found");
        
    }
    return 0;
} 
    @Override
    public void traverse(String s) { // print tree
//       LNR(root);
        
        switch(s){
             case "LNR":
                 LNR(root);
                 break;
             case "NLR":
                 NLR(root);
                 break;
             case "LRN":
                 LRN(root);
                 break;
         }
 }
    void LNR(node d){
        if(d==null){}
        else{
            LNR(d.left);
            System.out.print(d.data+" , ");
            LNR(d.right);}
        }

    void NLR(node temp){
        if(temp==null){
        }else{
            System.out.print(temp.data+",");
            NLR((temp.left));
            NLR((temp.right));
        }
    }
    void LRN(node temp){
    
    if(temp==null){
        }else{
        LRN((temp.left));
        LRN((temp.right));
        System.out.print(temp.data+",");
    }
    }

//public void LNR(node n) { // print tree
// if(n==null){}
// else{
//     LNR(n.left);
//     System.out.print(n.data+" , ");
//     LNR(n.right);}
// }

  void Delnochildno(node<T>parent,node<T>temp){
       
            if(parent.left==temp)
                parent.left=null;
            else
                parent.right=null;
           
    
    }
  void DelnochildOne(node<T>parent,node<T>temp){
       if(temp.data.compareTo(parent.data)<0){
            if(parent.left==temp)
                parent.left=temp.right;
            else
                parent.right=temp.left;}
       else{
            if(temp.left==null)
                parent.right=temp.right;
            else
                parent.right=temp.left;
       }

    }
    @Override
    public void delete(T d) {
     node n=new node(d);
    node<T> temp=root;
    node<T> parent=root;
    while(temp!=null && d.compareTo(temp.data)!=0){
        parent=temp;
        if(d.compareTo(temp.data)<0){
            temp=temp.left;
        }
        else{
            temp=temp.right;
        }
    }
    if(temp !=null){
        //System.out.println("not found");
    
        //no child case
        if(temp.left==null&&temp.right==null){
        Delnochildno( parent , temp);
        
        }
        //one child case
        else if((temp.left==null && temp.right!=null)||(temp.left!=null&& temp.right==null)){
            DelnochildOne( parent , temp);
                }
        //two child case
        else{
                node t1=temp.right;
                node t2 =temp.right;
                while(t1.left!=null){
                t2=t1;
                t1=t1.left;
                }
                if(t1.left==null && t1.right==null){
                    if(t1==t2){Delnochildno(temp,t1);}
                    else{
                    Delnochildno(t2,t1);}
                }
                else if((t1.left==null && t1.right!=null)||(t1.left!=null&& t1.right==null)){{
                if(t1==t2){DelnochildOne(temp,t1);}
                else {
                    DelnochildOne(t2,t1);}
                }
           }
    
    }
    }
    else{
        System.out.println("Not found");
    }
    
    }
    @Override
    public int countleaf(){
    return CL(root);
    }
    int CL(node temp){
         if(temp==null){
             return 0;
         }
         else if(temp.left==null && temp.right==null){
             return 1;
         }
         else{
             return CL(temp.left)+CL(temp.right);
         }
     }
    @Override
      public int height(){
    return height1(root);
    }
 public int height1(node temp){
     int heightLeft;
     int heightRight;
     if(temp !=null){
         heightLeft=height1(temp.left);
         heightRight=height1(temp.right);
         return Math.max(heightLeft, heightRight)+1;
     }
     else{
         return 0;
     }
 }

   
}
