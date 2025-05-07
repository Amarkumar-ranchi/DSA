package com.myjlc.recursion;
public class Lab2 {
static void show() {
	System.out.println("show-begin");
	show();
	System.out.println("show-end");
}
	public static void main(String[] args) {
show();

	}

	

}
