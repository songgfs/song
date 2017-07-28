package com.asiainfo.chapter1.liangzhiqiang.day2;

/**
 * Created by 君不悔 on 2017/7/25.
 */
import java.util.Scanner;
public class Title3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜测的数字(1-1000)退出请按0");
        int a = sc.nextInt();

        int i=5;
        while( a != i && i<10)
        {
            System.out.println(a>i?"太小了":"太大了");
            a = sc.nextInt();
        }
        System.out.println("恭喜，你猜对了");


    }
}