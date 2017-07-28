package com.asiainfo.chapter1.liangzhiqiang.day2;

/**
 * Created by 君不悔 on 2017/7/25.
 */
import java.util.Scanner;
public class Title1 {
    public static void main(String[] args) {
// 输入数据
        Scanner console = new Scanner(System.in);
        System.out.println("请输入单价（￥）：");
        double unitPrice = console.nextDouble();
        System.out.println("请输入数量：");
        double amount = console.nextDouble();
        System.out.println("请输入金额（￥）：");
        double money = console.nextDouble();
        console.close();
// 计算商品总价
        double totalPrice = 0.0;
        totalPrice = unitPrice * amount;
        if (totalPrice >= 500) {
            totalPrice = totalPrice * 0.8;
        }
        if (money >= totalPrice) {
            double change = money - totalPrice;
            System.out.println("应收金额为：￥" + totalPrice + "，找零为：￥" + change);
        }else{
            System.out.println("输入信息有误！");
        }
    }
}

