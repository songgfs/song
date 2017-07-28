package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Random;

public class TestSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int[] nums=new int[10];
		int a=0;
		System.out.print("数组中的数据为：[ ");
		for(int i=0;i<=9;i++){
			nums[i]=random.nextInt(100);
			System.out.print(nums[i]+" ");
			if(nums[i]>=nums[0]){
				a=nums[i];
			}
		}
		System.out.println("]");
		System.out.println("最大值为："+a);
	}

}
