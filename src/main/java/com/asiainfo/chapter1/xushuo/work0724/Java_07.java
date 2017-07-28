package com.asiainfo.chapter1.xushuo.work0724;

/**
 * Created by root on 2017/7/24.
 * 99乘法表
 */
public class Java_07 {
    public static void main(String[] args) {
        System.out.println("9*9");
        int x,y;
        for(x = 0;x <= 9; x++) {
            for (y = 1;y <= x; y++) {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
}