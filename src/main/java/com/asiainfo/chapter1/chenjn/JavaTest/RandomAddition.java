package com.asiainfo.chapter1.chenjn.JavaTest;

import java.util.Scanner;

/**
 * Created by JN on 2017/7/26.
 */
public class RandomAddition
{
    public static int i;
    public static int sum;
    public static int m;
    public static int input;
        void Exit(){
            System.out.print("此次测试结束，你的分数是："+(i-m-1)*10);
        }
        public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            RandomAddition ra = new RandomAddition();
            System.out.print("请开始10次加法测试..."+"\n");
            for(i=1;i<11;i++){
                int num1 = (int)(Math.random()*100);
                int num2 = (int)(Math.random()*100);
                System.out.print("("+i+")."+num1+ "+ "+num2+" = "+"?"+"\n");
                sum = num1+num2;
            System.out.print("请输入答案（输入-1退出）：");
            input = scanner.nextInt();
            if (input==-1){
                ra.Exit();
                break;
            }
            else if (input!=sum){
                m++;
                System.out.print("Error!"+"\n");
            }
            else if (input==sum){
                System.out.print("Correct!"+"\n");
            }
if (i==10){
                ra.Exit();
                break;
}
            }
        }
    }

