package com.asiainfo.chapter1.zhangle.day2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by del on 2017/7/25.
 */
public class JiaFa {
    Scanner sc=new Scanner(System.in);
    int i=1;


    public  void jiaSuan() {

        int count = 0;
        while (i<=10){
            Random random = new Random();
            int a = (int) (Math.random() * 100);  //方法一表示100以内的随机数
            int b = random.nextInt(99);  //方法二
            System.out.print("（"+i+"）");
            System.out.println(a + "+" + b + "=?");
            System.out.println("请输出答案（输出-1退出）:");
            int in = sc.nextInt();
            if ((a + b) == in) {
                count = count + 10;
                System.out.println("Correct!");

            }else if (in == -1) {
                break;
            } else {
                System.out.println("Error!");
            }
            i++;
        }
        System.out.println("此次测验结束，你的分数是：" + count);


    }
    public static void main(String[] args){
        JiaFa jf=new JiaFa();
        int i=1;
        System.out.println("将开始10次加法测试...");
        jf.jiaSuan();



    }
}
