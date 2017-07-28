package com.asiainfo.chapter1.dongwenchao.day02.zuoye;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo2 {
    public static void run(int b){
        //进行判断
        if (b<0||b>100){
            System.out.println("请输入0到100以内的分数");
        }else if(b>=90){
            System.out.println("A");
        }else if(b>=80&&b<=90){
            System.out.println("B");
        }else if(b>=60&&b<=80){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
public static void main(String[] args){
    Scanner a = new Scanner(System.in);/*in是System这个类里面的一个InputStream类型的静态变量。
                                           而你new Scanner(System.in)就是说构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。
                                            nextDouble() 是Scanner类里面的方法，用in（对象的引用）去调用*/
    System.out.println("请输入该学员的分数(0-100)：");
    while(true){
        int b = a.nextInt();
        run(b);
    }
}
}
