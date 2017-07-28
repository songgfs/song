package com.asiainfo.chapter1.zhangle.day2;

import java.util.Scanner;

/**
 * Created by del on 2017/7/25.
 */
public class Grade {
    public static void makeGrade(int grade){

        if(grade < 0 || grade > 100){
            System.out.println("请输入0到100以内的分数");
        }else if(grade>=90){
            System.out.println("A");
        }
        else if(grade>=80){
            System.out.println("B");
        }
        else if(grade>=60){
            System.out.println("C");
        }else System.out.println("D");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入该学员的分数（0-100）：");
            int grade=sc.nextInt();
            makeGrade(grade);
        }
    }
}
