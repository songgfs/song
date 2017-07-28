package fqtest;

import java.util.Scanner;

public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 0.0,sum0=0.0,sum1 = 0.0;
		int number = 0;
		Scanner can=new Scanner(System.in);
		System.out.println("请输入单价：");
		price = can.nextDouble();
		System.out.println("请输入数量：");
		number = can.nextInt();
		sum1 = price * number;
		if(sum1 > 500){
			sum1 = sum1*0.8;			
		}
		System.out.println("请输入金额：");
		sum0 = can.nextDouble();
		System.out.println("应收金额为："+sum1+",找零为："+(sum0 - sum1));
		
		
		
		

	}

}
