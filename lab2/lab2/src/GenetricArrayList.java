/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
//interface is extended
public class GenetricArrayList<T extends Comparable<T>>
{
T[] Arr;
int currIndex;

GenetricArrayList()	// default constructor to create an array
{               // object should not be kept
Arr = (T[])new Comparable[10];
currIndex=-1;
}

GenetricArrayList(int size)	// constructor to create an array
{
Arr = (T[])new Comparable[size];
currIndex=-1;
}

public String toString(){
String str="";
for(int i=0; i<Arr.length;i++)
str=str+Arr[i]+"\n";
return str;

}
public void add (T data)	// method to add value in an array
{
// Assume the insertion is going to perform in the end,
//	next to the last inserted location. If no available space
//	then increase the arr size to insert new value
    
    if(currIndex==-1){
        currIndex++;
        Arr[currIndex]=data;
        }
        
        
    if(currIndex==Arr.length-1){
        T[] NewArr=(T[])new Comparable[2*Arr.length];
            for(int i=0;i<Arr.length;i++){
                 NewArr[i]=Arr[i];
                    
                }
            Arr=NewArr;//moving the pointer to Arr
           }
         
    if (data.compareTo(Arr[currIndex])>0){
        currIndex++;
        Arr[currIndex]=data;
            }
         
         
    else if (data.compareTo(Arr[currIndex])<0)
        {
            for(int i=currIndex;i>=0;i--)
            {
                if(data.compareTo(Arr[i])<0)
                    
                    Arr[i+1]=Arr[i];
                    Arr[i]=data;
                
            }
            currIndex++;
            }
}

public int Find(T value)
{
 for(int i=0;i<Arr.length;i++){
     if(value.compareTo(Arr[i])==0){
     System.out.println(i);return i;
     
     }
 }
return -1;
} // if the value found in array then return it’s index;

public void clear()
{
 Arr=null;   
}

public T get(int value)
//value is index value
{
    
        return Arr[value];
    
}

public void update(int ind,T value)
{
    Arr[ind]=value;
}

public void remove(T value)
{
    for(int i=0;i<currIndex;i++){
        if(value.compareTo(Arr[i])==0){
            for(int k=i;k<currIndex;k++){   
              Arr[k]=Arr[k+1];
     
            }
        }
        currIndex--;
    }
} // first find the value in an array then delete the value.
//	delete through backward movement in an array.


}