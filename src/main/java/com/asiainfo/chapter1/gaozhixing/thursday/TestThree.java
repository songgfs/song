package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Scanner;

public class TestThree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guess();
	}
	public static void guess(){
		System.out.println("请输入你猜测的数字(1-1000)，退出请按0");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		if(a==500){
			System.out.println("恭喜你，猜对了");
			return;
		}
		if(a==0){
			System.out.println("真遗憾，下次再挑战吧。");
			return;
		}
		if(a>500){
			System.out.println("太大了！");}
		else{
			System.out.println("太小了！");}
		guess();
	}
}
