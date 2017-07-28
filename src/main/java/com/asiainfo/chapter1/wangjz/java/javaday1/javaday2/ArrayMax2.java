package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class ArrayMax2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[11];
        int m=0;
        System.out.print("数组中的数据为：");
        for(int i=0;i<10;i++){
            a[i]=(int) (Math.random() * 100);
            System.out.print(+a[i]+"  ");
        }
        for(int i=0;i<10;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        System.out.println();
        System.out.print("最大值为：");
        System.out.println(m);
        System.out.print("新数组中的数据为：");
        b[b.length-1]=m;
        System.arraycopy(a,0,b,0,a.length);

        for(int i=0;i<11;i++){
            System.out.print(b[i]+"  ");
        }
    }
}
