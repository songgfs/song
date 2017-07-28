package com.asiainfo.chapter1.dongwenchao.day02.zuoye;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo7 {
    public static void main(String[] args){
        int array[]=new int[10];
        int array1[] =new int[11];
        Random a=new Random();
        for (int i=0;i<array.length;i++) {
            array[i] = a.nextInt(100);
        }
        System.out.println("数组中的数据为："+ Arrays.toString(array));
        int max=array[0];
        for (int i=1;i<array.length;i++){
            if (max < array[i]){
                max=array[i];
            }
        }
        System.out.println("最大值是："+max);
        array1[10] = max;
        System.arraycopy(array,0 ,array1,0,array.length);
        System.out.println("新数组中的数据为："+ Arrays.toString(array1));
    }
}
