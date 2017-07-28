package com.asiainfo.chapter1.Jiashihao.Javalianxi;
import java.util.Scanner;


public class di4ti{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
        int score=0;                        
        for(int i=1;i<=10;i++){             
        int a=(int)(Math.random()*100+1);   
        int b=(int)(Math.random()*100+1);
        int answer=a+b;                     
        System.out.println("("+i+")"+a+"+"+b+"=?");
        System.out.println("请输入答案,输入-1退出");
         int guess=sc.nextInt();
         if(guess== -1){                
         System.out.println("退出");
         break;
         }
         if(guess==answer){
         System.out.println("Correct，下一题");
                 score+=10;
         }
        if(guess!=answer){
        System.out.println("Error，下一题");
        }
        
        
        }
       System.out.println("此次测验结束，你的分数是:"+score);
      
      } 
}


