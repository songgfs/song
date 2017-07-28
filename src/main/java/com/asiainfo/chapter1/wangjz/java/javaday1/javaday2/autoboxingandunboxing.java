package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;



import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class autoboxingandunboxing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        Integer A=10;//装箱
        Integer i=new Integer(10);//装箱
        int b=i;//int b=i.intValue();拆箱
        Integer x=255;//-128~127
        Integer y=255;
        String d="2";
        String e="23";
        e=e.substring(0,1);
        System.out.println(e.equals(d));
        System.out.println(e==d);
        System.out.println(i==A);
        System.out.println(x==y);

        System.out.println(i.equals(A));
    }
}
