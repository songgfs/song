package com.asiainfo.chapter1.Jiashihao.Javalianxi;

import java.util.Scanner;

public class di1ti{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入单价:");
        float price = sc.nextFloat();
        //���뵥��
        System.out.println("请输入数量:");
        int quantity = sc.nextInt();
        //��������
        double money= price * quantity;
        //������
        System.out.println("请输入金额:");
        float payment_amount = sc.nextFloat();
      if (price * quantity >= 500){
    	   money =  price * quantity * 0.8;
       }
      //�жϽ���Ƿ񳬹�500�������������
    	   System.out.println("应收金额为($) :" + money);
        System.out.println("找零为（$）: " + (payment_amount - money));
    }
}