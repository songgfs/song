package com.asiainfo.chapter1.dongwenchao.day02.zuoye;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo4 {
    public static void main(String[] args) {
        System.out.println("将开始 10 次加法测试... ");
        Scanner scanner = new Scanner(System.in);
        //用于记载分数
        int score = 0;
        //构建 10 次循环
        for (int i=1;i<=10;i++) {
            //随机生成两个加数
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int result = a + b;

            //输出需要计算的加法表达式
            System.out.println("(" + i + "). " + a + " + " + b + " = ?");
            System.out.print("请输入答案（输入-1退出）： ");
            //读入结果
            int answer = scanner.nextInt();
            //判断对错
            if(answer == -1){
                break;
            }else if (answer != result) {
                System.out.println("Error!");
                continue;
            } else {
                score += 10;
                System.out.println("Correct!");
            }
        }
        scanner.close();
        System.out.println("此次测验结束，你的分数是：" + score);
    }
}
