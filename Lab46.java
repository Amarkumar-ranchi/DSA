package com.myjlc.loops;

// 46.print the Following Pattern
// 
public class Lab46 {
    public static void main (String []args) {
        int rows = 10;
        int spaces=25;
        int stars = 1;

        for(int i = 1; i <= rows; i++) {
            //print spaces
        	for(int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // print stars
            for(int k = 1; k <= stars; k++) {
                System.out.print(" * ");
            }
            // print new line
            System.out.println(""); 
            spaces=spaces-2;
            stars=stars+2;
        }
    }
}



//Time complexity-O(rows* stars )
// Space complexity-O(1)
