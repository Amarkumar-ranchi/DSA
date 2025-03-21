package com.myjlc.loops;

//3.Swap 2 Strings

public class Lab3 {

	public static void main(String[] args) {
String str1="Hello";
String str2="Guys";

 System.out.println(str1+"\t"+str2);
 
String temp=str1;
str1=str2;
str2=temp;

System.out.println(str1+"\t"+str2); 
}

}

//Time complexity-O(1)
// Space complexity-O(1)
// 1 is constant