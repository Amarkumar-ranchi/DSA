package com.jlcindia.arrays;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {

	public static void main(String[] args) {
//1.create the 	ArrayList
		ArrayList<Integer>mylist=new ArrayList<Integer>();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		System.out.println(mylist.contains(99));
		for(int x:mylist) {
		System.out.println(x);
		}
	}

}
