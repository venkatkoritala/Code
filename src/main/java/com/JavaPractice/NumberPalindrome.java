package com.JavaPractice;

import java.util.Scanner;

class NumberPalindrome {
    public static void main(String[]a){
        System.out.println("****Enter the number to check -Palindrome****");
        int num= new Scanner(System.in).nextInt();
        int originalNum=num;
        int remainder,reverseNumber=0;
        if(num!=0) {
            while (num != 0) {
                remainder = num % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                num = num / 10;
            }
            if (reverseNumber == originalNum)
                System.out.println("Given Number " + originalNum + " is Pallindrome");
            else
                System.out.println("Given Number " + originalNum + " is not Pallindrome");
        }
        else
            System.out.println("Please enter a number greater than zero");
    }

}
