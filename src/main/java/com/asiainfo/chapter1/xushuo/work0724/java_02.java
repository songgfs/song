package com.asiainfo.chapter1.xushuo.work0724;

/**
 * Created by root on 2017/7/24.
 * 创建、初始化、操纵代码
 */
public class java_02 {
    public static void main(String[] args) {
        double[] myList = {1.1, 2.2 ,3.3, 4.4, };
        //打印所有数组元素
        for (int i = 0; i<myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        //计算所有元素的总和
        double total = 0;
        for ( int i = 0; i<myList.length;i++) {
            total += myList[i];
        }
        System.out.println("Total is" + total);
        //查找最大元素
        double max = myList[0];
        for (int i = 1; i<myList.length;i++) {
            if (myList[i] > max) max=myList[i];
        }
        System.out.println("Max is" + max);
    }
}
