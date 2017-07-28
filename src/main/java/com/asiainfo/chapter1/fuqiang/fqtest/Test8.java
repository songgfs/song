package fqtest;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={10,9,8,7,6,5,4,3,2,1};
		System.out.print("原数组元素为：");
		int number=1;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("--冒泡排序开始--");
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<10-i-1;j++){
				if(a[j]>a[j+1]){
					number=a[j];
					a[j]=a[j+1];
					a[j+1]=number;
				}
			}
			for(int g=0;g<a.length;g++){
				System.out.print(a[g]+" ");
			}
			System.out.println();
			
		}
		System.out.println("--冒泡排序结束--");
		for(int g=0;g<a.length;g++){
			System.out.print(a[g]+" ");
		}
		
		

	}
	

}
