package com.asiainfo.chapter1.Jiashihao.Javalianxi;
import java.util.Scanner;

public class di6ti {
	public static void main(String[] args){
		        int[] arr={74,40,0,28,78,23,6,51,62};
		        int max=getMax(arr);
		        System.out.print("数组中的数据为[74,40,0,28,78,23,6,51,62]"+"最大值是"+max);
		    }
		    public static int getMax(int[] arr){
		        int max=arr[0];
		        for(int i=1;i<arr.length;i++){
		            if(arr[i]>max){
		                max=arr[i];
		            }
		        }
		        return max;
	}

}
