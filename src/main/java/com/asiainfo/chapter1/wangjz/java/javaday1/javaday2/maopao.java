package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;
import java.util.*;
/**
 * Created by wjz123456 on 2017/7/25.
 */
public class maopao {
    public static void main(String[] args) {
        int a[]=new int[10];

        System.out.print(" {  ");
        for(int i=0;i<10;i++){
            a[i]=(int) (Math.random() * 100 );
            System.out.print(a[i]+" ");
        }System.out.println("  }");
        System.out.println("  - - - - 冒泡排序开始- - - - - - -");
        for(int i=1;i<10;i++){
            for( int j=0;j<10-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }System.out.println(Arrays.toString(a));

        }
        System.out.println(" - - - - 冒泡排序结束- - - - - - -");

        System.out.println(Arrays.toString(a));
    }
}
