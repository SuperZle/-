package com.zle.Zy;

import java.util.Scanner;

public class Zy06 {
    /**
     *计算字符串中字母，数字，符号，空格各有几个
     */
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s=sc.nextLine();
        //char[] chars = s.toCharArray();
        String replace = s.replaceAll("\\D","");
        System.out.println("该字符串中数字有"+(replace.length()));

        String replace1 = s.replaceAll("\\S","");
        System.out.println("该字符串中空格有"+(replace1.length()));

        String replace2 = s.replaceAll("[^a-zA-Z]","");
        System.out.println("该字符串中字母有"+(replace2.length()));
//        String replace3 = s.replaceAll("[^\\x00-\\xff]","");
//        System.out.println("该字符串中汉字有"+(replace2.length()-replace3.length()));
        System.out.println("该字符串中其它有"+(s.length()-replace.length()-replace1.length()-replace2.length()));




    }
}
