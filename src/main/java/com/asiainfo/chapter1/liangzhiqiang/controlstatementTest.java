package com.asiainfo.chapter1.liangzhiqiang;
/**
 * Created by 君不悔 on 2017/7/24.
 */

public class controlstatementTest {

public static void main (String[] args) {
    int a = 1;//初始化
    while (a < 10) {//条件判断
        System.out.println(a);//循环体
        a++;//迭代，如果没有这一句，就是死循环，a一直都是1
    }
    System.out.println("while循环结束！");
}
}