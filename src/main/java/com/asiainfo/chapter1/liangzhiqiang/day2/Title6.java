package com.asiainfo.chapter1.liangzhiqiang.day2;

import java.util.Random;

/**
 * Created by 君不悔 on 2017/7/25.
 */
public class Title6 {
    public static void main(String[]args){
        int[] n=new int[10];
        Random r=new Random();//实例化一个随机数对象
        for (int i=0;i<n.length;i++) {
            n[i] = r.nextInt();//将一个随机数组赋给下标为i的数组元素
            System.out.println(n[i]);//打印这个数显示

        }
        int max=n[0];//初始将数组的第一个数当成最大的数给max变量
        for (int i=1;i<n.length;i++){
            //如果max小于下标为i的数组元素，就重新赋值
            if (max<n[i])max=n[i];
        }
        System.out.println("最大："+max);//显示最大的数
    }
}
