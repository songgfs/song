package com.asiainfo.chapter1.zhangle.day2;

import java.util.Scanner;

/**
 * Created by del on 2017/7/25.

 /*
 编写一个收银柜台收款程序。根据商品单价、购买数量
 以及收款金额计算并输出应收金额和找零；
 当总价大于或等于500时，享受8折优惠。控制台交互情
 */
public class ShouKuan {
    public static void suan(double danjia,int count,double monkey){
       double mo=danjia*count;
        if(mo >= 500){
            mo=mo*0.8;
            monkey=monkey-mo;
        }else {
            monkey=monkey-mo;
        }
        System.out.println("应收金额为：￥"+mo+",找零为：￥"+monkey);

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入单价（￥）：");
        double danjia=sc.nextDouble();
        System.out.println("请输入数量：");
        int count=sc.nextInt();
        System.out.println("请输入金额（￥）：");
        double monkey=sc.nextDouble();
        suan(danjia,count,monkey);


    }
}
