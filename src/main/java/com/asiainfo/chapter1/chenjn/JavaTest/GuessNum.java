package com.asiainfo.chapter1.chenjn.JavaTest;

import java.util.Scanner;

/**
 * Created by JN on 2017/7/26.
 */
public class GuessNum {
    public static int num;
    public static int num1;
    public static boolean p=true;

    void Exit(){
System.out.print("真遗憾，下次再挑战吧！");
    }

public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GuessNum gn = new GuessNum();
        num = (int) (Math.random() * 1000+1);
        System.out.print("请输入你猜测的数字（1~1000），退出请按0："+"\n");
        num1 = scanner.nextInt();
        while (p==true){
            if (num1==0){
                gn.Exit();
                break;
            }
else if (num1==num){
    System.out.print("恭喜你，猜对了！");
    break;
}
else if (num1>num){
    System.out.print("太大了！"+"\n");
                num1 = scanner.nextInt();
}
else if (num1<num){
    System.out.print("太小了！"+"\n");
                num1 = scanner.nextInt();
}
        }
    }
}