package com.JavaPractice;

public class AaBbCcDDL2U {
    public static void main(String[]args)
    {
        String word="AaBbCcDD";
        System.out.println("AaBbCcDD after changeing the lower case a to uppercase A");
        char[]chars=word.toCharArray();
        for(char x:chars)
        {

            if(Character.isLowerCase(x)&& Character.compare(x,'a')==0)
                x=Character.toUpperCase(x);
            System.out.print(x);
        }
    }
}
