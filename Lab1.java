package com.jlcindia.arrays;

public class Lab1 {

	public static void main(String[] args) {
//1.create the 	Arrays
		int arr[]=new int[6];
		//2.Find the Length of Array
		int size=arr.length;
		System.out.println(size);
		
		//3.Accessing Elements
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		//4.Assign the Values
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		//5.Accessing Elements
for(int x:arr)
	System.out.println(x);
	}

}
