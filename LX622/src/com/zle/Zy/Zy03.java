package com.zle.Zy;

import java.util.Arrays;
import java.util.Scanner;

public class Zy03 {
    /**
     * 请使用 Arrays 相关的API, 将一个随机字符串中的所有字符升序排列，并倒序打印。
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入个字符串");
        String s=sc.nextLine();
        fun(s);
    }
    public static void fun(String s){
        //Arrays
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
