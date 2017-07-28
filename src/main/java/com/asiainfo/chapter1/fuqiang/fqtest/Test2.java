package fqtest;

import java.util.Scanner;

public class Test2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		char live = ' ';
		Scanner can=new Scanner(System.in);
		System.out.println("请输入成绩：");
		grade = can.nextInt();
		if(grade > 100){
			System.out.println("请输入100以内的数！！！！");
		}else if (grade >= 90){
			System.out.println("A");
		}else if(grade >= 80){
			System.out.println("B");
		}else if(grade >= 70){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		
		
		
		

	}

}
