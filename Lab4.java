package com.jlcindia.arrays;

import java.util.ArrayList;
import java.util.List;
//Array Operations
//Search Operation
public class Lab4 {
public static int linearSearch(int arr[],int element) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element)
			return i;
	}
	return-1;
}
	public static void main(String[] args) {
int arr[]= {30,20,50,10,60,50,40};		
int element=90;
int index=linearSearch(arr,element);
System.out.println(index);
if(index==-1)
	System.out.println("Sorry,Element Not Found");
else
	System.out.println("Yes,Element Found at "+index);
	}

}
