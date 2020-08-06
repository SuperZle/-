package com.zle.Zy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Zy01 {
    /**
     * 计算自己活了多少天
     *       需求  键盘输入自己的生日  例如 1997-08-15
     *       如果输入的日期大于当前日期 提示您还没有出生
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入格式为:yyyy-MM-dd");
        String s=sc.nextLine();
        fun(s);

    }
    public static void fun(String s) throws ParseException{
        Date date1 = new Date();
        String date="1996-2-19";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);

        if (parse.before(sdf.parse(date))){
            System.out.println("您还没有出生");
        }
        long timeafter = parse.getTime();
        long timenow = date1.getTime();
        System.out.println("您已经活了"+((timenow-timeafter)/(24*60*60*1000))+"天");

    }
}
