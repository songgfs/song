package com.asiainfo.chapter1.liangzhiqiang;
/**
 * Created by 君不悔 on 2017/7/24.
 */

public class dowhile {
    private static void main (String[]args){
        int a=0;
        while (a>0){//【while：先判断，后执行】
            System.out.println(a);
            a++;
    }
        System.out.println("........");
        a=0;
        do {
            System.out.println(a);
            a++;
        }
        while (a<0);//【do-while:先执行，后判断】不管条件符不符合。
        }
}
