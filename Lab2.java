package com.myjlc.loops;

//2.Swap 2 Numbers without 3rd Variable

public class Lab2 {

	public static void main(String[] args) {
int a=10;
int b=20;

 System.out.println(a+"\t"+b);
 
a=a+b;
b=a-b;
a=a-b;

System.out.println(a+"\t"+b); 
}

}

//Time complexity-O(1)
// Space complexity-O(1)
// 1 is constant
// This logic Works only for Numbers