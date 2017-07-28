package com.asiainfo.chapter1.zhangle.day2;

/**
 * Created by del on 2017/7/25.
 */
public class JiuJiuBiao {
    public static void jiu(int i){
        if (i == 1) {
            System.out.println("1*1=1 ");
        } else {
            jiu(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        jiu(9);
    }
}
