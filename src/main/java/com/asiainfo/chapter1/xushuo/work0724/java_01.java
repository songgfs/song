package com.asiainfo.chapter1.xushuo.work0724;

/**
 * Created by root on 2017/7/24.
 * 数组求和
 */
public class java_01 {
    public static void main(String[] args) {
        //数组大小
        int size=8;
        //定义数组
        double[] myList=new double[size];
        myList[0]=5.6;
        myList[1]=5.6;
        myList[2]=5.6;
        myList[3]=5.6;
        myList[4]=5.6;
        myList[5]=5.6;
        myList[6]=5.6;
        myList[7]=5.6;
        //计算所有数组的和
        double sum = 0;
        for (int i=0; i<size; i++) {
            sum += myList[i];
        }
        String s=String.format("%.1f" , sum);
        System.out.println(s);
    }
}
