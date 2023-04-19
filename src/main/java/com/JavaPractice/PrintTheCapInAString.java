package com.JavaPractice;


public class PrintTheCapInAString {
    public static void main(String[]args) {
        String text = "Hello World, How Are You!";
        char[] textArray = text.trim().replaceAll(" ", "").toCharArray();
        for(char a:textArray)
        {
            if(Character.isUpperCase(a))
                System.out.print(a);
        }

    }
}
