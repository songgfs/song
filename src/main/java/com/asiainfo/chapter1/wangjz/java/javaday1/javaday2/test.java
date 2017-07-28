package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class test {
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        String str3="helloworld";
        StringBuffer str11=new StringBuffer("helloworld");
        str1+=str2;
        System.out.println(str1.equals(str11));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
        System.out.println(str1);
        System.out.println(str11);
    }
}
