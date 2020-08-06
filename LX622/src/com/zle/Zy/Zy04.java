package com.zle.Zy;

import java.util.Arrays;
import java.util.Scanner;

public class Zy04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入个字符串");
        String s=sc.nextLine();
        fun(s);
    }
    public static void fun(String s){
        char[] chars = s.toCharArray();
        int j=0;
        System.out.print("字符串中第");
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == 'a'){
                j++;
                System.out.print(i+",");
            }
        }
        System.out.println("为a");
        System.out.println("a共出现了"+j+"次");
    }
}
