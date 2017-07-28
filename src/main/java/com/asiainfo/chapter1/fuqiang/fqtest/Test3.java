package fqtest;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =-1;
		Random ran=new Random();
		int number2 =ran.nextInt(1000);
		Scanner can=new Scanner(System.in);
		do{
			System.out.println("请输入你猜测的数字：");
			number1=can.nextInt();
			if(number1==0){
				System.out.println("真遗憾，下次在挑战吧！");
			}else{
				if(number1==number2){
					System.out.println("恭喜你，猜对了");
				}else{
					if(number1>number2){
						System.out.println("太大了");
					}else{
						System.out.println("太小了");
					}
				}
			}
			
		}while(number1!=0 && number1 !=number2);
		
		
		
		

	}

}
