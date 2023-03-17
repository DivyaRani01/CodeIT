package com.BasicJavaProgram;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Initialize two pointers, one at the start and the other at the end of the array
        int i = 0, j = charArray.length - 1;
        
        // Swap the characters at i and j and move the pointers towards each other
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        
        // Convert the character array back to a string
        String reversedStr = new String(charArray);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedStr);
        
        sc.close();
    }
}

