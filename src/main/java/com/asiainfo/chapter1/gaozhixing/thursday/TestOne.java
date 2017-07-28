package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Scanner;

public class TestOne {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入单价：");
		double price=s.nextDouble();
		System.out.println("请输入数量：");
		int num=s.nextInt();
		System.out.println("请输入金额：");
		double count=s.nextDouble();
		double cunprice=price*num;
		if(cunprice>=500){
			cunprice=cunprice*0.8;
		}
		System.out.print("应收金额为：￥"+cunprice);
		System.out.println("找零为：￥"+(count-cunprice));
	}
}
