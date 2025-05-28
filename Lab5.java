package com.jlcindia.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Array Operations
//Insert the element at given position
public class Lab5 {
public static void insert(int arr[],int element,int position) {
	int n=arr.length;
	int myindex=position-1;
	for(int i=n-2;i>myindex;i--) {
		arr[i+1]=arr[i];
	}
	arr[myindex]=element;
	}


	public static void main(String[] args) {
		int arr[]=new int[10];
 arr[0]=10;
 arr[1]=20;
 arr[2]=30;
 arr[3]=40;
 arr[4]=50;
 	System.out.println(Arrays.toString(arr));
 	
 	insert(arr,99,3);
 	System.out.println(Arrays.toString(arr));
 	insert(arr,60,7);
 	System.out.println(Arrays.toString(arr));
 	insert(arr,88,4);
 	System.out.println(Arrays.toString(arr));
	}
}
//Time Complexity-O(n)
//Aux space-O(1)
//When There is no space to insert,then this alogorithm will not work
