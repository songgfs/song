package com.asiainfo.chapter1.songgf;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
public class Practice {
    public static void main(String[] args) {
        /*数组*/
        Arry();
        MethodString();
        Change();
    }
    private static void Arry(){
        /*
        * 定义数组通用为 String[]  string = ....;可以在定义时候就为其进行赋值，也可以进行先分配空间，再经过其它方法进行赋值
        *在数组定义后可以在往后的位置进行对数组进行更改的操作，为其重新进行赋值，数组可以定为很多类型的，除了八种基本的数据类型外，还有引用的数据类型
        * 运算符的使用++；--；==；+；>=等等一些运算符，主要是在一些循环，比较等一些操作下才用到的
        * 函数就是所对应的方法，
        * java的控制语句分大致的三种，选择，迭代和跳转，选择按照语句中的情况进行选择所走的路，迭代是程序可以重复的执行一条或者多条的语句；迭代是按照非线性的进行的执行
        * 递归和迭代：递归就是在程序或者函数中调用自身，把复杂的问题推到比原问题简单的一个问题的求解（如斐波纳契数列的计算就是使用了递归）
        *             迭代就是利用原变量的值推出一个变量的新的值，迭代就是不停的在调另外一个函数
        *             递归中一定有迭代，但是迭代不一定有递归，这两则之间可以进行转换
        *  八种基本的数据类型：int double long byte char float short boolean
        *  类型转换有自动转换和强制转换两种，自动转换由低字节往高字节的转换，但是要是从高字节往低字节转换的话就是会损失精确度，导致数据的不准确；
        *  Stringbuffer 与 string ：string是一个不可变的对象，当你修改了的String对象的值，其实是重新创建了一个String对象，而Stringbuffer则是可以更改的对象
        *                          使用append进行着添加的属性的操作；
        *
        * */
        String[] strings = {"song","gao","feng"};
        for (int i = 0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
    }

    /*String方法的练习*/
    private static void MethodString(){
        String s = "wqweqedqwdwqdqwdassaadasd";
        System.out.println("chatAt截取字符串"+s.charAt(2));
        System.out.println("substring从那个下标开始截取"+s.substring(2));
        System.out.println("replace替代字符串"+s.replace("w","f"));
        System.out.println("toUppercase将字符串全部转换成大写，同时还有相反的方法"+s.toUpperCase());
        System.out.println("subSequence截取指定的字符串从什么开始，到哪结束，含尾不含头"+s.subSequence(2,5));
        System.out.println("trim去掉首尾的空格"+s.trim());
        System.out.println("chatAt截取字符串"+s.charAt(2));
    }
    private static void Change(){
        /*自动转换*/
        int num = 1223;
        double doNum = num;
        System.out.println(doNum);
        /*进行强制转换*/
        double doNewMwmber = 234322;
        int in = (int)doNewMwmber;
        System.out.println(in);
        /*装箱*/
        Integer integer = new Integer(num);
    }
}
