package com.zle.Zy;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Zy02 {
    /**
     * 输入年份 计算改年份是否是闰年
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入年份");
        int i=sc.nextInt();
        fun(i);
    }
    public static void fun(int i)  {
        if (i%4==0 && i%100 !=0){
            System.out.println(i+"是闰年");
        }else {
            System.out.println(i+"不是闰年");

        }
    }
}
