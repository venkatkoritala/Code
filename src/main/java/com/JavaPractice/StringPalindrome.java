package com.JavaPractice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[]args)
    {
        System.out.println("****Enter String to check -Palindrome");
        String word= new Scanner(System.in).next();
        String word1 = "";
        StringBuffer sf = new StringBuffer();
        sf.append(word);
        if(word.equalsIgnoreCase(sf.reverse().toString()))
         System.out.println("Given is palindrome");
        else
            System.out.println("Given String is not palindrome");

        //reverse the string
        char[]newWord=word.toLowerCase().toCharArray();
        for(int i=newWord.length-1;i>=0;i--)
        {
            word1=word1+newWord[i];
            System.out.println(word1);
        }
        if(word.equalsIgnoreCase(word1))
            System.out.println("given string is palindrome");
        else
            System.out.println("given string is not a palindrome");

    }
}
