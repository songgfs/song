package com.asiainfo.chapter1.wangjz.java.javaday1;

/**
 * Created by wjz123456 on 2017/7/24.
 */
public class test2 {
    /*
    九九乘法表
     */
    public static void main(String args[]){
        for(int i=1;i<10;i++){
            for(int l=1;l<10;l++){
                System.out.print("  "+i*l);
                if(i==l){
                    break;
                }
            }
            System.out.println();
        }
    }
}
