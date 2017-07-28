package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class randomadd {
    static int s;
  static  int count=0;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("将开始十次加法测试....");

 for(int i=1;i<=10;i++){
     int a= (int) (Math.random() * 100);
     int b=(int) (Math.random() * 100);
     System.out.println(i+")"+""+a+"+"+b+"=" );
     s=sc.nextInt();
     if(s==a+b){
         count=count+10;
     }else
     if(s==-1){
         System.out.println("测试结束....你的分数是"+count);break;
     }
 }
        System.out.println("测试结束....你的分数是"+count);
    }

    }

