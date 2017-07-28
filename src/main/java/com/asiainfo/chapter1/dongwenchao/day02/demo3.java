package com.asiainfo.chapter1.dongwenchao.day02;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo3 {
    public static void main(String args[]) {
        demo3 dt = new demo3();
        /*dt.m11();
        dt.m12();*/
        dt.m13();
    }
    public void m11() {
        /*Integer a = new Integer(100);
        Integer b = 100;*/
        /*Integer a = new Integer(100);
        Integer b = new Integer(100);*/
        /*Integer a = 100;
        Integer b = 100;*/
        int a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println("m11 result " + (a == b));
    }
    public void m12() {
        /*Integer a = new Integer(128);
        Integer b = 128;*/
        /*Integer a = new Integer(128);
        Integer b = new Integer(128);*/
        /*Integer a = 128;
        Integer b = 128;*/
        Integer a = Integer.valueOf(128);
        Integer b = 128;
        System.out.println("m12 result " + (a == b));
    }
    public void m13(){
        int a =65;
        Integer a1 =52;
        System.out.println(a1);
    }

}
