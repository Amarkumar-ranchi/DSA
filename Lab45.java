package com.myjlc.loops;

// 45. Print the Following Pattern
public class Lab45 {
    public static void main(String[] args) {
        int rows = 7;
        int stars = 1;

        // Print upper part
        for (int i = 1; i <= rows / 2 + 1; i++) {
            for (int k = 1; k <= stars; k++) {
                System.out.print(" * ");
            }
            System.out.println(""); // Move to the next line
            stars=stars+1;
        }

        // Print lower part
        for (int i = 1; i <= rows / 2; i++) {
            for (int k = 1; k <= stars-2; k++) {
                System.out.print(" * ");
            }
            System.out.println(""); // Move to the next line
            stars=stars-1;
        }
    }
}
   


//Time complexity-O(rows* stars )
// Space complexity-O(1)
