package fqtest;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={7,6,5,4,3,2,1};
		int max=-1;
		System.out.print("原数组元素为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				max=a[i];
				a[i]=a[i+1];
				a[i+1]=max;
			}
		}
		
		System.out.println("最大的值为："+a[6]);
		System.out.print("现数组元素为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
	

}
