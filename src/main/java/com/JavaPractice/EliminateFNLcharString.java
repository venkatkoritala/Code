package com.JavaPractice;

import java.util.Scanner;

public class EliminateFNLcharString {
    public static void main(String[]args)
    {
        System.out.println("Enter a String to eliminate first & last char and print");
        String word=new Scanner(System.in).nextLine();
        System.out.println("String after eliminating first and last char is "+word.substring(1,word.length()-1));
    }
}
