package com.asiainfo.chapter1.wangjz.java.javaday1;

import org.junit.Test;

/**
 * Created by wjz123456 on 2017/7/24.
 */

/*
String类对象为不可变对象，一旦你修改了String对象的值，
隐性重新创建了一个新的对象，释放原String对象，
StringBuffer类对象为可修改对象，
可以通过append()方法来修改值
 */

public class test4 {
    @Test
    public  void  test(){
        String str1="wjz";
        String str11="www";
        String str12="w";
        str12=new String("www");
        str1=str1+"  hello";
        StringBuffer str2=new StringBuffer();
        str2.append("www");
        System.out.println(str1+"  "+str2);
        System.out.println(str11.equals(str12));
        System.out.println(str11==(str12));
    }
    /*
数据类型之间的转换，
数据类型 byte int short long float double char boolean
 */
    public static void main(String args[]){

        int a=10;
        int b=20;
        double c=20.0;
        float d=  15.0f;
        int m=a+b;
        int n= (int) (a+c);
        int k=(int)(b+d);
        double j=d;
System.out.println(m+" "+n+"   "+k+"   "+j);
    }

}
