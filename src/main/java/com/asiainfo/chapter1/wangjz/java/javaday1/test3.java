package com.asiainfo.chapter1.wangjz.java.javaday1;

/**
 * Created by wjz123456 on 2017/7/24.
 */
public class test3 {
    public static void main(String args[]){
        int s=0;
        int c=1,b=2;
        for(int a=1;a<100;a++){
             s=s+a;
        }
        System.out.println(s);
       System.out.println(f(10));
        System.out.println(o(21,7));
        System.out.println(c/b);
        print(12);

    }


    public static  void print(int n){
        if(n/2>0){
            print(n/2);
        }
        System.out.println(n%2);
    }
    /*
    递归调用！
     */
    public static int f(int n){
        if( n==1||n==2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
    /*
    迭代！
     */
    public static int o(int a,int b){
        if(a<=0||b<=0){
            return 0;
        }else{
            while(b>0){
                int c=a%b;
                a=b;
                b=c;
            }
            return a;
        }
    }

   }