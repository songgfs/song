package com.asiainfo.chapter1.liangzhiqiang.day2;

/**
 * Created by 君不悔 on 2017/7/25.
 */
import java.util.Scanner;
public class Title2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入该学员的分数(0-100)：");
        int score = scanner.nextInt();
        scanner.close();
        if(score<0 || score>100){
            System.out.println("请输入0到100以内的分数");
        }else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}