package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Random;
import java.util.Scanner;

public class TestFour {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random random=new Random();
		System.out.println("将开始10次加法测试..");
		int i=10;
		int b=0;
		int score=0;
		while(i>0){
			System.out.print("("+i+") ");
			int a=random.nextInt(100);
			int c=random.nextInt(100);
			b=a+c;
			System.out.println(a+"+"+c+"=?");
			System.out.print("请输入答案（输入-1退出）");
			int e=s.nextInt();
			if(e==-1){
				break;
			}
			if(e==b){
				System.out.println("Currect!");
				score=score+10;
			}
			else{
				System.out.println("Error!");
				
			}
			i--;
		}
		System.out.println("此次测验结束，你的分数是："+score);
		
	}
}
