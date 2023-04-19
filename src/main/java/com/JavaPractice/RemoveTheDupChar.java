package com.JavaPractice;

import java.util.Scanner;

public class RemoveTheDupChar {
    public static void main(String[]args)
    {
        System.out.println("Enter the string to remove the duplicate char and print ");
        String text=new Scanner(System.in).nextLine();
        StringBuffer text2=new StringBuffer();
        text.chars().distinct().forEach(c->text2.append((char)c));
        System.out.println("String after removing duplicate chars is : "+text2);
    }
}
