package com.myjlc.loops;

// 44.print the Following Pattern
// 
public class Lab44 {
    public static void main (String []args) {
        int rows = 5;
        int stars = 1;

        for(int i = 1; i <= rows; i++) {
            
            // print stars
            for(int k = 1; k <= stars; k++) {
                System.out.print(" * ");  // Use print() to stay on the same line
            }
            // move to the next line after printing 5 stars
            System.out.println(""); 
            
            stars=stars+1;
        }
    }
}



//Time complexity-O(rows* stars )
// Space complexity-O(1)
