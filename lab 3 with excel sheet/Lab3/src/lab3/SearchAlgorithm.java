/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author DELL
 */
public class SearchAlgorithm {
    public boolean LinearSearch(int[] Arr, int item){
        int count=1;// false count is catch her;
        for(int i=0;i<Arr.length;i++)//n+1 repeat
        {
            count+=2;
             if(item==Arr[i])  //n runtime
                 return true;
        }
        System.out.println("Linear Search Count = "+(count++));
        return false;
    }
    public boolean BinarySearch(int[] Arr,int item){
        int first=0;
        int last=Arr.length-1;
        int mid=-1;
        int count=3;
        while(first<last){
        mid=(first+last)/2;
        count+=5;
        if(item<Arr[mid]){
            last=mid-1;
        }
        else if(item==Arr[mid]){
            return true;}
        else
        { first=mid+1;}
    }
        System.out.println("Binary Search Count = "+(count++));
        return false;
    }
}
