package com.JavaPractice;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[]a)
    {
        System.out.println("enter the height of the pyramid");
        int hieght=new Scanner(System.in).nextInt();
        for(int i=hieght;i>0;i--)
        {
           for(int j=hieght-i;j>0;j--)
               System.out.print(" ");
           for(int j=1;j<=i*2-1;j++)
               System.out.print("*");
            System.out.println("");
        }
    }
}
