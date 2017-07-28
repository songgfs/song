package fqtest;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={1,2,3,4,5,6,7};
		int max=-1;
		System.out.print("数组元素为：");
		for(int b:a){
			if(b>max){
				max=b;
			}
			System.out.print(b+" ");
		}
		
		System.out.println("最大的值为："+max);

	}
	

}
