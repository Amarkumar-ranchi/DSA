package com.myjlc.loops;

// 43.print the Following Pattern
// 
public class Lab43 {
    public static void main (String []args) {
        int rows = 5;
        int stars = 5;

        for(int i = 1; i <= rows; i++) {
            
            // print stars
            for(int k = 1; k <= stars; k++) {
                System.out.print(" * ");  // Use print() to stay on the same line
            }
            // move to the next line after printing 5 stars
            System.out.println("");  
        }
    }
}


//Time complexity-O(n^2)
//Time complexity-O(rows* stars )
// Space complexity-O(1)
