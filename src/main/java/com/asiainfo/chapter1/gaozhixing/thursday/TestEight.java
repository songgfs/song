package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Random;

public class TestEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int[] nums=new int[10];
		for(int i=0;i<=9;i++){
			nums[i]=random.nextInt(100);
		}
		System.out.print("[ ");
		for(int a:nums){
			System.out.print(a+" ");
		}
		System.out.println("]");
		System.out.println("---------冒泡排序开始---------");
		for(int i=9;i>0;i--){
			for(int a=0;a<i;a++){
				if(nums[a]>nums[a+1]){
					nums[a+1]=nums[a+1]+nums[a];
					nums[a]=nums[a+1]-nums[a];
					nums[a+1]=nums[a+1]-nums[a];
				}
				
			}
			System.out.print("[ ");
			for(int a:nums){
				System.out.print(a+" ");
			}
			System.out.println("]");
		}
		System.out.println("---------冒泡排序结束---------");
		System.out.print("[ ");
		for(int a:nums){
			System.out.print(a+" ");
		}
		System.out.println("]");
	}

}
