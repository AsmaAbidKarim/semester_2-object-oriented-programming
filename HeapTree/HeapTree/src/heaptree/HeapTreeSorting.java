/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptree;

/**
 *
 * @author DELL
 */
public class HeapTreeSorting <T extends Comparable<T>> {
    T[] Arr;//a list
    T[] Arr2;
    int CurrInd;
   HeapTreeSorting(){
        Arr= (T[])new Comparable[1000];
        Arr2= (T[])new Comparable[1000];
        CurrInd=-1;
    }
    HeapTreeSorting (int size){
        Arr=(T[])new Comparable[size];
        CurrInd=-1;
    }
     public void Insert(T item)
   {
       if(CurrInd==-1){
        CurrInd++;
        Arr[CurrInd]=item;
        
        }
        else if(CurrInd==Arr.length-1){
            T[] NewArr = (T[])new Object[2*Arr.length];
           //System.arraycopy(Arr, 0, NewArr, 0, Arr.length);
           System.arraycopy(Arr, 0, NewArr, 0, Arr.length);
            Arr=NewArr;//moving the pointer to Arr
            
            for(int i=0;i<Arr.length-1;i++){
             if(Arr[i] == null){
                 Arr[i]=item;
             }
        }
        }
        else {
            for(int i=0;i<Arr.length;i++)
            {
             if(Arr[i] == null){
                 Arr[i]=item;
                 break;
                 
             }
        }
         
        } }  
    
       public void swap(int index, int P){
        T temp=Arr[index];
        Arr[index]=Arr[P];
        Arr[P]=temp;
        
        
    }
      
    public void buildMaxHeap(){ 
      
        for(int i=1;Arr[i]!=null;i++){
            int C=i;
            int P=(C-1)/2;
            while(P>=0){
                if(Arr[C].compareTo(Arr[P])>0){
                    swap(C,P);
                }
                C=P;
                if(P!=0)
                    P=(P-1)/2;
                else
                    P=-1;
                
                
            }
        }
    }
    public void ReHeap(){ 
        int Ch=Arr.length-1;
        int Pa=0;
        while(Pa<Ch){
            int CL=2*Pa+1;
            int CR=2*Pa+2;
            if(CL<Arr.length && CR<Arr.length){
                if(Arr[CL].compareTo(Arr[CR])>0){
                if(Arr[CL].compareTo(Arr[Pa])>0){
                    swap(CL,Pa);
                    Pa=CL;
                }
                }
                else{
                    if(Arr[CR].compareTo(Arr[Pa])>0){
                    swap(CR,Pa);
                    Pa=CR;
                }
            }
        }
            break;
    }
    }
    public int find(T key){
		int temp =0;
		
		while (key.compareTo(Arr[temp])!=0 &&  temp<Arr.length) {
			if(key.compareTo(Arr[temp])<0) {
				temp=2*temp+1;	
			}			
			else {
				temp=2*temp+2;		
			}		
			
		}	
		
		if(Arr[temp]==null) {
			System.out.println("NOT FOUND!");
			
		}
		else 
			System.out.println("FOUND at " + temp +"th index" );
		return temp;
		
	}
    // if delete is given value
    public void delete(T d) {
    	int last=0;
    	int n = find(d);
    	 for(int i=0;Arr[i]!=null;i++)
    	    	last=i;
    	    
    	Arr[n]=Arr[last];
    	Arr[last]=null;
    	buildMaxHeap();
    	
    }
    public void delete1(){
    //always delete root
        for(int i=0;Arr[i]!=null;i++){
        Arr[i]=Arr[Arr.length-1];
        Arr[Arr.length-1]=null;
        ReHeap();
        }
    }
    //delete root
    public void delete(){
    for(int i=0;Arr[i]!=null;i++)
    	Arr[i]=Arr[i+1];
    }
    public void print(){
         for(int i=0;i<Arr.length-1;i++){
             if(Arr[i] !=null)
           System.out.println(Arr[i]);  
    }}
}
