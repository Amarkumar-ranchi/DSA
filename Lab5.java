package com.myjlc.loops;

//5.Find Min and max of 3 Numbers

public class Lab5 {

	public static void main(String[] args) {
int a=10;
int b=20;
int c=30;

int min=(a<b)?a:b;
 System.out.println(min);
 
 int max=0;
 
if(a>b)
  max=a;
else if(b>c)
	max=b;
else
	max=c;
System.out.println(max);
	}

}

//Time complexity-O(1)
// Space complexity-O(1)
// 1 is constant