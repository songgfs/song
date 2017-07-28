/*
package com.asiainfo.chapter1.luomin.zhangle.day1;

import org.junit.Test;

*/
/**
 * Created by del on 2017/7/24.
 *//*

public class one {
    @Test
    public void date(){
        System.out.println("数据类型：");
        //byte
        byte b=-10;
        System.out.println("b="+b);
        //short
        short s=12;
        System.out.println("short 二进制位数："+Short.SIZE);
        //int
        int i=10;
        //int -> long可以自动转换
        long l=i;
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        //double
        double d=12.3;
        //double->int 强制转换（小类型）
        int ii=(int)d;
        System.out.println("l="+l);
        System.out.println("ii="+ii);
        System.out.println(" ");
    }

    @Test
    public void yunsuan(){
        System.out.println(" ");
        System.out.println("运算：");
        int a=10,b=3;
        double c;
        c=a+b;
        System.out.println("a+b="+c);
        c=a-b;
        System.out.println("a-b="+c);
        c=a*b;
        System.out.println("a*b="+c);
        c=a/b;
        System.out.println("a/b="+c);
        c=a%b;
        System.out.println("a%b="+c);
        c=++a;
        System.out.println("a++"+c);
        b--;  //b的值发生改变变为2
        System.out.println("b--="+b);
        c=--b; //b的值发生改变变为1
        System.out.println("c=b--"+c);
        System.out.println("a="+a);//输出此时a的值
        System.out.println("b="+b);//输出此时b的值
        System.out.println("c="+c);//输出此时c的值
        System.out.println(" ");
    }

    @Test
    public void yuju(){
        System.out.println("语句：");
        int a=10,b=3;
        for(int i=0;i<b;i++){
            a--;
            if(a<10){
                System.out.println(a);
            }
        }
        System.out.print("b的值是：");
        switch (b){
            case 1:System.out.println(b);break;
            case 2:System.out.println(b);break;
            case 3:System.out.println(b);break;
            default:System.out.println(b);break;
        }
        System.out.println(" ");

    }

    @Test
    public void shuzu(){
        System.out.println("数组：");
        int[] arr=new int[2];
        arr[0]=10;
        arr[1]=8;
        System.out.print("数组arr的值是：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        double[] dou={1.2,10};
        System.out.println(" ");
    }

    @Test
    public static void digui(int i){
        if (i == 1) {
            System.out.println("1*1=1 ");
        } else {
            digui(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    public int diedai(int n){
        int result=1;
        for(int i=2;i<n;i++){
            result=result*i;
            System.out.println(i+"的阶乘是:"+result);
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args){
        one o=new one();
        o.date();
        o.shuzu();
        o.yunsuan();
        o.yuju();
        System.out.println("99乘法表：");
        digui(9);   //静态方法调用
        System.out.println("n!迭代实现");
        o.diedai(9);
    }
}
*/
