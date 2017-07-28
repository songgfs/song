package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class Score {
    public static  void gradescore(double s){
        if (s > 100 | s < 0) {
            System.out.println("请输入0到100以内的分数：");
        }
           else if (s >= 90) {
                System.out.println("A");
            } else if (s>= 80) {
                System.out.println("B");

            } else if (s>= 60) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入该学员的分数（0-100）：");
        while (true){
            double s = sc.nextDouble();
            gradescore(s);

        }

    }

}
