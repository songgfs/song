package com.asiainfo.chapter1.dongwenchao.day02;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo4 {
    public static void main(String[] args){
        String S2 = "My ";
        String S3 = "name is ";
        String S4 = "dongwenchao ";
        String S1 = S2 +S3 + S4;
        System.out.println(S1);
        StringBuffer Sb = new StringBuffer("My ").append("name is ").append("dongwenchao ").append("too!").append("123").insert(4,"1230.");
        System.out.println(Sb);
    }
}
