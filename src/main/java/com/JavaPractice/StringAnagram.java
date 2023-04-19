package com.JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[]a)
    {
        System.out.println("Enter 2 strings to check anagram");
        Scanner s=new Scanner(System.in);
        String string1=s.nextLine().replaceAll(" ","").toLowerCase();
        String string2=s.nextLine().replaceAll(" ","").toLowerCase();
        if(string1.length()==string2.length())
        {
            char[]arr1=string1.toCharArray();
            Arrays.sort(arr1);
            char[]arr2=string2.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.compare(arr1,arr2)==0)
                System.out.println("given 2 strings are anagram");
            else
                System.out.println("given 2 strings are not anagram");
        }
        else
            System.out.println("given 2 strings are not anagram as length not matched");
    }
}
