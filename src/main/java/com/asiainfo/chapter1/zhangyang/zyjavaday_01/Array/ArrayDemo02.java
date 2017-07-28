package com.asiainfo.Array;

import java.util.Arrays;

public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		String arrString = Arrays.toString(nums);
		// 使用Array的toString方法打印输出数组的内容
		//toString方法主要是将数组转换为字符串形势输出
		System.out.println(arrString);
		//使用for循环遍历数组元素
		for(int i=0;i<nums.length;i++){
			System.out.print(i+"\n");
		}
		//加强型for循环遍历数组
		int [] num = {11,22,33};
		for(int i:num){
			System.out.println(i);
		}
	}
}
