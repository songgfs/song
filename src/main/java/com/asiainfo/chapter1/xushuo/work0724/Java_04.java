package com.asiainfo.chapter1.xushuo.work0724;

/**
 * Created by root on 2017/7/24.
 * java函数 返回值void
 */
public class Java_04 {
    public static void main(String[] args) {
        printGrade(90);
        printGrade(59.5);
        System.out.println("输入成绩=90\n输入成绩=59.5\n并进行判断");
    }
    public static  void printGrade(double score) {
        char grade;
        if (score >= 90.0)
            System.out.println("A");
        else if (score >=80.0)
            System.out.println("B");
        else if (score >=70.0)
            System.out.println("C");
        else if (score >=60.0)
            System.out.println("D");
        else
            System.out.println("E");
    }
}
