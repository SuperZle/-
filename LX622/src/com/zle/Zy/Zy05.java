package com.zle.Zy;

import java.util.Scanner;

public class Zy05 {
    /**
     *将字符串首字母大写
     */
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        String substring = s.substring(0, 1);
        String substring1 = s.substring(1);
        String s3 = substring1.toLowerCase();
        String s1 = substring.toUpperCase();
        String s2=s1+substring1;
        System.out.println(s2);
    }
}
