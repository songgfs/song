package main.java.com.asiainfo.chapter1.gaozhixing.thursday;

import java.util.Random;

public class TestSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int[] nums=new int[11];
		nums[10]=0;
		System.out.print("数组中的数据为：[ ");
		for(int i=0;i<=9;i++){
			nums[i]=random.nextInt(100);
			System.out.print(nums[i]+" ");
			if(nums[i]>=nums[10]){
				nums[10]=nums[i];
			}
		}
		System.out.println("]");
		System.out.println("最大值为："+nums[10]);
		System.out.print("新数组中的数据为：[ ");
		for(int a:nums){
			System.out.print(a+" ");
		}
		System.out.println("]");
	}

}
