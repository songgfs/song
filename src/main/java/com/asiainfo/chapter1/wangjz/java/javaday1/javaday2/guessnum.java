package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Scanner;


/**
 * Created by wjz123456 on 2017/7/25.
 */
public class guessnum {

    public static void main(String[] args) {
         final int n = 326;
         int s;
        Scanner sc = new Scanner(System.in);
do{System.out.print("请输入你猜的数字（0-1000）:退出请按0:");
    s=sc.nextInt();
    if(s==0){
        System.out.println("真遗憾，下次再来挑战吧!"); break;
    }
    else if(s==n) {
        System.out.print("恭喜你，猜对了！");  break;
    }
   else if (s>n)
        System.out.println("太大了!");
    else
        System.out.println("太小了!");

}while (s!=n);
        }
}
