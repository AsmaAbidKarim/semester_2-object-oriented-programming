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

public void MergeSort(int [] arr, int L, int U) {
		int mid = (L+U)/2;
		if (L<U) {
			MergeSort(arr,L,mid);
			MergeSort(arr,mid+1,U);
			merge(arr,L,mid,U);
		}
	}
	public void merge(int [] arr,int L,int mid, int U) {
		int list1_S=L;
		int list1_E=mid;
		int list2_S=mid+1;
		int list2_E=U;
		int  k=0;
		int [] temp=new int [U-L+1];
		while(list1_S<=list1_E && list2_S<=U) {
			comp++;
			swap++;
			if(arr[list1_S]<arr[list2_S])
				temp[k++]=arr[list1_S++];
			else
				temp[k++]=arr[list2_S++];
		}
		while(list1_S<=list1_E) {
			swap++;
			temp[k++]=arr[list1_S++];
		}
		while(list2_S<=U) {
			swap++;
			temp[k++]=arr[list2_S++];
			
		}
		for(int i=0;i<temp.length;i++) {
			swap++;
		arr[L++]=temp[i];	
		}
		
	}
}
