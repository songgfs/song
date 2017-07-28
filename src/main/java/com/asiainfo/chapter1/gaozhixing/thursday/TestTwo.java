package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		double score=s.nextDouble();
		if(score>100||score<0){
			System.out.println("请输入0到100以内的分数：");
			score=s.nextDouble();
		}
		if(score>=90){
			System.out.println("A");
			return;
		}
		if(score>=80){
			System.out.println("B");
			return ;
		}
		if(score>=60){
			System.out.println("C");
			return;
		}
		System.out.println("D");
	}

}
