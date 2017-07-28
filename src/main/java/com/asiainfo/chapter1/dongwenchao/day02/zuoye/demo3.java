package com.asiainfo.chapter1.dongwenchao.day02.zuoye;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo3 {
    public static void run(int guest){
        int rNum = (int) (Math.random() * 1000) + 1;
        Scanner s = new Scanner(System.in);
        /*System.out.println(game);*/
        while(guest != rNum){
            if (guest == 0){
                break;
            }else if (guest > rNum){
                System.out.println("太大了!");
            }else if(guest < rNum){
                System.out.println("太小了!");
            }
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            guest = s.nextInt();
        }

            if(guest == rNum) {
                System.out.println("恭喜，你猜对了!");
            }else{
                System.out.println("真遗憾，下次再挑战吧!");
            }
        }

    public static void main(String[] args){
        System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
        Scanner s = new Scanner(System.in);
        int guest = s.nextInt();
        run(guest);
    }
}
