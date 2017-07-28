package com.asiainfo.chapter1.Jiashihao.Javalianxi;

import java.util.Scanner;

public class di2ti {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入该学员的分数（0-100）");
	int Grades= sc.nextInt();
	//
	if(Grades<0 ||Grades>100){
		System.out.println("请输入0到100以内的分数");
	}
	else if(Grades>=90){
		System.out.println("A");
	}//
	else if(Grades>=80){
		System.out.println("B");
	}//
	else if(Grades>=60){
		System.out.println("C");
	}//
	else if(Grades<60){
		System.out.println("D");
	}//
}
}
