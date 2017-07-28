package com.asiainfo.chapter1.wangjz.java.javaday1;

import org.junit.Test;

/**
 * Created by wjz123456 on 2017/7/24.
 */
public class test {
    @Test
    public void test(){
        String str1[]=new String[]{"aa","bb","wjz","dd"};
        String str2[]=new String[4];
        System.out.println(str2.length);
        System.out.println(str1.equals(str2));
        System.out.println(str1.length==(str2.length));
        for(String s:str1){
            System.out.println(s);
        }
    }
    @Test
    public void test1(){
        int a=6,b=-6,c=50;
        System.out.println(c%a+"  "+c%b);
        System.out.println(a>0&b<0);
        System.out.println(a>0|b>0);
        System.out.println(a<0^b>0);
        a=a+b;//两变量进行数据互换，不需要第三变量！
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"  b=  "+b);
    }

}
