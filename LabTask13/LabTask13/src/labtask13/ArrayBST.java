/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask13;

/**
 *
 * @author DELL
 * @param <T>
 */
public class ArrayBST<T extends Comparable<T>> {
    T[] tree;
    int root=0;
    ArrayBST( int size){
    tree = (T[]) new Comparable[size];
    
    }
    
    public void insert(T d){
        if(tree[0]==null){
            tree[0]=d;
        }
        else{
            int temp=0;
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
                System.out.print("Array Is Full");
            }
        
        }}
    
    public void find(T d){ 
       boolean found=false;  
      if (isEmpty())
         System.out.print("Array Is Empty");
      else
      {
         int temp=0;
            while(temp<tree.length &&tree[temp] !=null){
                if(d.compareTo(tree[temp])<0){
                    temp=2*temp+1;
                    if(tree[temp]==d){
                        System.out.println(d+"Is found");
                        found=true;
                        break;
                    }
                    
                }
                else{
                temp=2*temp+2;
                if(tree[temp]==d){
                        System.out.println(d+"Is found");
                        found=true;
                        break;
                    }
                }
                
            }
         }
      
      if (found==false)
         System.out.println("element not found in the binary tree");
      
      else
      System.out.println(d +" Is found");}
    
    public boolean isEmpty(){
        if(tree[0]==null)
            return true;
        else
            return false;
    }
    public void delete(T d) {
        int height = 1;
      int maxIndex = tree.length;
              int count=tree.length;
         T result = null;
      boolean found = false;

      if (isEmpty())
         System.out.print("Array Is Empty");
      else
      {
      for (int i = 0; (i <= maxIndex) && !found; i++) {
         if ((tree[i] != null) && d.equals(tree[i])) 
         {
            found = true;
            result = tree[i] ;
            int temp=0;
            while(temp<tree.length &&tree[temp] !=null){
                if(d.compareTo(tree[temp])<0){
                    temp=2*temp+1;
                    
                }
                else{
                temp=2*temp+2;
                }
                
            }
            if(temp<tree.length &&tree[temp] ==null){
                tree[temp]=null;
            }
            else{
                
            }
            count--;
         }
      }

    
    }}
    public void traverseLNR(){
        for (int i = root; i < tree.length; i++) {
            if (tree[root] != null)
                System.out.print(tree[i]+",");
            else
                System.out.print("-");
        }
    }
    
    public void traverse(){
        for(int i = 0; i < tree.length; i++){
            if (tree[i] != null){
                //i=2*root+1;
                System.out.print(tree[i]+",");}
            else{
                //i=2*root+2;
                System.out.print("");}
        }

    }
}
    

