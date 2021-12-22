/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangesort;

/**
 *
 * @author DELL
 */
public class ExchangeSort {
    int comp;
    int swap;
    public void bubble (int [] arr) {
	boolean flag = true;
	for(int i =0;i<arr.length && flag;i++) {
		flag=false;
		for(int j =0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				flag=true;
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;	
			}
		}
	}
}
    
public void selection(int [] arr) {
	int j=1;
	for(int i = 0;i<arr.length-1;i++) {
	//int max=arr[i];
	int index=i;
	for ( j=i+1;j<arr.length;j++) {
		if (arr[j]<arr[index]) {
			index=j;
		}
	}
	int n= arr[index];
	arr[index]=arr[i];
	arr[i]=n;
	}
}
public void insertion(int [] arr) {
	for(int i = 1;i<arr.length;i++) {
		int j=i;
		int data= arr[j];
		while (j>0 && data<arr[j-1]) {
			arr[j]=arr[j-1];
			j--;			
		}
		arr[j]=data;
	}
}
public void quickSort(int[] arr,int L,int U){
    int mid = partition(arr,L,U);
    if(L<mid-1){
        quickSort(arr,L,mid-1);}
    if((mid+1)<U){
        quickSort(arr,mid+1,U);
        
    }
}
public int getcomp(){
    return comp;
}
public int getSwap(){
    return swap;
}
int partition (int[] arr , int L,int U){
    int ind =L;
    int pivot =arr[L];
    while(L<U){
        
        while(L<=U && arr[L]<= pivot){
            L++;
             comp++;
        }
       
        while(L<=U&& arr[U] > pivot){
            U--;
             comp++;
        }
        if(L<U){
            swap++;
            int temp=arr[L];
            arr[L]=arr[U];
            arr[U]=temp;
        }
    }
    swap++;
    arr[ind]=arr[U];
    arr[U]=pivot;
    return U;
}

}
