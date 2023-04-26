package com.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneAList {
    static List<String> original=new ArrayList<>();
    static List<String>clonedList=new ArrayList<>();
    public static void main(String[]a)
    {
        String[]names={"hari","giri","gita","somu"};
        original= Arrays.asList(names);
        System.out.println(original);
        clonedList.addAll(original);
        //Collections.copy(clonedList,original); won't work as clonedlist size is 0
        System.out.println(clonedList);
    }

}
