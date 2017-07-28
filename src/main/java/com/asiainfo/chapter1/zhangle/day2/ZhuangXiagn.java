package com.asiainfo.chapter1.zhangle.day2;

/**
 * Created by del on 2017/7/25.
 */
public class ZhuangXiagn {

    public void zhuangx(){
        Integer e=10;//自动装箱
        int aa=new Integer(10);//自动拆箱
        System.out.println("e==aa:"+(e==aa));
        int a=10;
        Integer b=new Integer(10);//调用b.intvalue();等价于b=new Integer(a)

        System.out.println("b.equals(a):"+b.equals(a));//比较a b 的值;
        System.out.println("a==b:"+(a==b));
        Integer i=new Integer(10);
        Integer ii=new Integer(10);
        System.out.println("i==ii:"+(i==ii));//两者的引用地址不同


    }

    public static void main(String[] args){
        ZhuangXiagn z=new ZhuangXiagn();
        z.zhuangx();


    }
}
