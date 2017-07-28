package com.asiainfo.Array;
import java.util.Arrays;

public class ArrayDemo03 {
	public static void main(String[] args) {
		String [] str = {"a","b","c","d"};
		//使用Arrays中的方法判断数卒中是否存在某个元素
		boolean boo = Arrays.asList(str).contains("b");
		System.out.println(boo);
	}
}
