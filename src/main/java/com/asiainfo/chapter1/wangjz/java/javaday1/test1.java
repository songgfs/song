package com.asiainfo.chapter1.wangjz.java.javaday1;

/**
 * Created by wjz123456 on 2017/7/24.
 */
public class test1 {
    public static int test(int a, int b){
        return a*b;
    }
    public  int add(){
       int a=3,b=4;
        return a+b;

    }
    public  static void main(String []args){
        test1 t=new test1();
        int s=t.add();
       System.out.println(s);
        System.out.println(test(4,5));
    }
}
