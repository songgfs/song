package com.asiainfo.chapter1.zhangle.day2;

import java.util.Scanner;

/**
 * Created by del on 2017/7/25.
 */
public class GuessWord {
    public static void getNum(int num,int sure){
        if(num==sure){
            System.out.println("恭喜，你猜对了！");
        }else if(num<sure && num!=0){
            System.out.println("太小了");
        }else if(num >sure){
            System.out.println("太大了");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sure=456;
        while(true){
            System.out.print("请输入你猜测的数字（1-1000），退出请按0：");
            int num=sc.nextInt();
            getNum(num,sure);
            if(num==0){
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }
        }
    }
}
