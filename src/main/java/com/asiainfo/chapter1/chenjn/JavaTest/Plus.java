package com.asiainfo.chapter1.chenjn.JavaTest;

/**
 * Created by JN on 2017/7/26.
 */
public class Plus {
    public static int i;
    public static int j;
    public static void main(String[] args) {
for(i=1;i<=9;i++){
    for(j=1;j<=i;j++){
        System.out.print(j+"*"+i+"="+i*j+" ");
    }
    System.out.print("\n");
}
    }
}