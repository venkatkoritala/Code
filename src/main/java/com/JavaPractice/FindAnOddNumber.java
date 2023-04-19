package com.JavaPractice;

import java.util.Scanner;

public class FindAnOddNumber {

    public static void main(String[]a)
    {
        System.out.println("*****Enter a Number to check whether it is an even or odd");
        if(new Scanner(System.in).nextInt()%2==0)
            System.out.println("\n given number is even ");
        else
            System.out.println("given number is Odd");
    }
}
