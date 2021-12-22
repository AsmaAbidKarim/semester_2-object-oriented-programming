/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19685
 */
public class MyArrayList {
    
    int[] Arr;//a list
    int CurrInd;//to where it's getting
    
    MyArrayList(){
    Arr=new int[10];
    CurrInd=-1;
    }
    MyArrayList(int size){
    Arr=new int[size];
    CurrInd=-1;
    }
    public void display(){
    String str="";
    for(int i=0;i<Arr.length;i++){
    System.out.print("\n"+ str);
    System.out.print( Arr[i]+str);
    }
    }
    public void InsertInOrder(int item)
    {
        if(CurrInd==-1){
        CurrInd++;
        Arr[CurrInd]=item;
        }
        
        
         if(CurrInd==Arr.length-1){
                int[] NewArr=new int[2*Arr.length];
                for(int i=0;i<Arr.length;i++){
                    NewArr[i]=Arr[i];
                    
                }
                Arr=NewArr;//moving the pointer to Arr
           }
         
          if (item>Arr[CurrInd]){
             CurrInd++;
             Arr[CurrInd]=item;
                    }
         
         
           else if (item<Arr[CurrInd])
            {
               
               
              
                for(int i=CurrInd;i>=0;i--)
                {
                    if(item <Arr[i])
                    
                         Arr[i+1]=Arr[i];
                         Arr[i]=item;
                
                   
                        
                    
                }
                
                
               
                CurrInd++;
              }
            }
            
    
    }



