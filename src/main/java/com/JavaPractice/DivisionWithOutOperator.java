package com.JavaPractice;

public class DivisionWithOutOperator {
    public static void main(String[]args)
    {
        int a=300;
        int b=2;
        int result=0;
        while (a>=b)
        {
         a=a-b;
         result++;
        }
        System.out.println("Division is "+result);
    }
}
