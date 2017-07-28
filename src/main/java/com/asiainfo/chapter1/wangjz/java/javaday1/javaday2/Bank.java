package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入单价（￥）");
        double p=sc.nextDouble();
        System.out.println("请输入数量");
        int s=sc.nextInt();
        System.out.println("请输入金额（￥）");
        double pay=sc.nextDouble();
        double n=p*s;
        double m=pay-p*s;
      if(p*s>=500){
          System.out.println("应收金额为：$"+n*0.8+","+"找零为：$"+(pay-n*0.8));
      }else{
          System.out.println("应收金额为：$"+n+","+"找零为：$"+m);

      }   if( p*s<500&&m<0){
            System.out.println("请再付"+m+"元");
        }
        if( p*s>500&&(pay-n*0.8)<0){
            System.out.println("请再付"+abs(pay-n*0.8)+"元");
        }
    }
}
