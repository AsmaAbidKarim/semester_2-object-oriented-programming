/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.task.pkg14;

import java.util.ArrayList;

/**
 *
 * @author DELL
 * @param <T>
 */
public class ArrayBinaryTree <T extends Comparable<T>> implements  InBinaryTree<T>{
    T[] tree;
    int root;
    ArrayBinaryTree(){
    tree = (T[]) new Comparable[1000];
    root=-1;
    }
    ArrayBinaryTree( int size){
    tree = (T[]) new Comparable[size];
    root=-1;
    }
    
    void preorder(ArrayList L,int temp){
        if(temp<tree.length){
        L.add(tree[temp]);
        tree[temp]=null;
        preorder(L,(2*temp+1));
        preorder(L,(2*temp+2));
        }
    }
    void insertSubtree(int temp, T d){  
        if(tree[temp]==null){
            tree[temp]=d;
        }
        else{
            int i=temp;
            while(i<tree.length && tree[i] !=null){
                if(d.compareTo(tree[i])<0){
                    i=2*i+1;
                }
                else{
                    i=2*i+2;
                }
            }
            if(i<tree.length && tree[i]==null){
                tree[i]=d;
            }
        }
    } 
    void LNR(int d){
        if( d<tree.length){
            LNR(2*d+1);
            if(tree[d]!=null){ System.out.println(tree[d]+"");}
            LNR(2*d+2);
        }
    }
    void NLR(int temp){
        if(temp<tree.length && tree[temp] !=null){
        
            System.out.print(tree[temp]+" ");
            NLR((2*temp+1));
            NLR((2*temp+2));
        }
    }
    void LRN(int temp){
    
    if(temp<tree.length && tree[temp] !=null){
        LRN((2*temp+1));
        LRN((2*temp+2));
        System.out.print(tree[temp]+" ");
    }
    }
    void delNoChild(int temp){
        tree[temp]=null;
    }
    void delOneChild(int temp){
        ArrayList<T> L=new ArrayList();
        preorder(L,temp);
        L.remove(0);
        for(int i=0;i<L.size();i++){
            if(L.get(1)!=null){
                insertSubtree(temp,L.get(i));
            }
        }
    }
    @Override
    public void insert(T d){
        if(root==-1){
            root=0;
            tree[root]=d;
        }
        else{
            int temp=root;
            while(temp<tree.length &&tree[temp] !=null){
                if(d.compareTo(tree[temp])<0){
                    temp=2*temp+1;
                    
                    
                }
                else{
                temp=2*temp+2;
                }
                
            }
            if(temp<tree.length &&tree[temp] ==null){
                tree[temp]=d;
            }
            else{
                if(tree[tree.length-2]!=null){
                T[] NewArr= (T[])new Object[2*tree.length-1];
                for(int i=0;i<tree.length;i++){
                    NewArr[i]=tree[i];
                    
                }
                tree=NewArr;
                insert(d);
            }
            }
        }}
    @Override
    public int find(T d){ 

       int temp=root;
       while(temp<tree.length &&d.compareTo(tree[temp])!=0 ||(tree[2*temp+1] !=null && tree[2*temp+1] !=null)){
           if(d.compareTo(tree[temp])<0){
               temp=2*temp+1;
           }
           else if(d.compareTo(tree[temp])>0){
               temp=2*temp+2;
           }
           if(d.compareTo(tree[temp])==0){
               System.out.print("\n"+"The Value "+d+" Is Found");
               return temp;
           }
           else if(temp<tree.length &&d.compareTo(tree[temp])!=0 &&(tree[2*temp+1] ==null && tree[2*temp+1] ==null)){
               System.out.print("\n"+"The Value " +d+" does not exist!");
               return -1;
           }
       }
       return -1;         
    }
    @Override
    public void delete(T d) {
        int temp =0;
        while(temp<tree.length && d.compareTo(tree[temp])!= 0){
            if(d.compareTo(tree[temp])<0){
                temp=2*temp+1;}
            else{
                temp=2*temp+2;}
        }
        if(temp< tree.length){
            int left=2*temp+1;
            int right=2*temp+2;
            if(left> tree.length && right>tree.length)
            {
                delNoChild(temp);
            }
            else if(left< tree.length && right<tree.length){
                if(tree[left] ==null && tree[right]==null){
                    delNoChild(temp);
                }
                else if((tree[left]==null && tree[right] !=null)|| (tree[left] !=null && tree[right]==null)){
                    delNoChild(temp);
                }
                else{
                    int i=right;
                    while(i<tree.length && tree[i]!=null){
                       // if(d.compareTo(tree[i])<0){
                            i=2*i+1;}
                        //}
                        //else{
                           // i=2*i+1;
                       // }
                        tree[temp]=tree[i];
                        int iR= 2*i+2;
                        if(iR <tree.length && tree[iR] !=null){
                            delNoChild(i);
                        }
                        else{
                            delOneChild(i);
                        }
                    }
            }
                    else if(left < tree.length && right >tree.length){
                        if(tree[left]==null){
                            delNoChild(temp);
                        }
                        else{
                            delOneChild(temp);
                        }
                    }
                }
        else{
            System.out.println("not found");
        }
            }
        

        
    @Override
     public void traverse(String s){
         System.out.println();
//        traverse1(root);
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
    @Override
    public int countleaf(){
    return CL(root);
    }
    int CL(int temp){
         if(tree[temp]==null){
             return 0;
         }
         else if(tree[(2*temp)+1]==null && tree[(2*temp)+2]==null){
             return 1;
         }
         else{
             return CL((2*temp)+1)+CL((2*temp)+2);
         }
     }
    @Override
    
    public int height(){
    return height1(root);
    }
  int height1(int temp)
 {
     if(tree[temp]==null){return 0;}
     else{
//         int heightLeft,heightRight;
//          heightLeft=height1((2*temp)+1);
//             heightRight=height1(2*temp+2);
         return Math.max(height1((2*temp)+1), height1(2*temp+2))+1;
         //return 0;
     }
}

    

    
    
}
