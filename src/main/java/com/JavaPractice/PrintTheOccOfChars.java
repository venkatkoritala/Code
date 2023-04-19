package com.JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintTheOccOfChars {
    public static void main(String[]args)
    {
        System.out.println("Enter the string to print the occurrence of chars ");
        String word= new Scanner(System.in).nextLine().trim();
        HashMap<Character,Integer>map=new HashMap<>();
        char[]chars=word.toCharArray();
        for(char a:chars)
        {
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else
                map.put(a,1);
        }
        for(Map.Entry e:map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
