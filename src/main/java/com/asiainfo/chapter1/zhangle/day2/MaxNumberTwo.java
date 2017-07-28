package com.asiainfo.chapter1.zhangle.day2;

import java.util.Random;

/**
 * Created by del on 2017/7/25.
 */
public class MaxNumberTwo {

    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[10];
        int i=0;
        System.out.print("数组中的数据为：[");
        for(;i<arr.length;i++){
            arr[i]=r.nextInt(99);
            System.out.print(arr[i]+",");


        }
        System.out.print("]");
        System.out.println();
        int max=arr[0];
        for(int j=0;j<arr.length;j++){

            if(max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println("最大值是："+max);
        int[] arrnew=new int[11];
        arrnew[arrnew.length-1]=max;
        System.arraycopy(arr,0,arrnew,0,arr.length);
        System.out.print("新数组中的数据是：");
        for(int st :arrnew){
            System.out.print(st+" ");
        }

    }
}
