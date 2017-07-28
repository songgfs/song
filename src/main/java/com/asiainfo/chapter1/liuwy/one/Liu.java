package com.asiainfo.chapter1.liuwy.one;

import java.util.Arrays;

/**
 * Created by LENOVO on 2017/7/24.
 */
public class Liu {
    public static  void main(String[] args){
        System.out.println("你是谁？");
        int[] a =new  int[10];
        for (int i =0;i<a.length;i++){
            a[i]=i+3;
            System.out.println(a[i]);
        }

        //为数组元素指定空串
        String[] name=new String[5];
        name[0]="liu";
        name[1]="我是1";
        name[2]="";
        name[3]="我是3";
        name[4]="liu";
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        //for each 输出数组内容
        for (String i:name) {
            System.out.println(i);

        }
        //对数组升序排序
        int[] b={10,20,30};
        Arrays.sort(a);
        for (int i:b) {
            System.out.println(i);

        }
        //使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
        int index=Arrays.binarySearch(a,10);
        System.out.println(index);
        //二维数组
        int[][] c=new int[2][2];
        c[0][0]=10;
        c[0][1]=20;
        c[1][0]=30;
        c[1][1]=40;
        //数组遍历
        for (int [] x:c) {
            for (int i:x) {
                System.out.println(i);

            }

        }
        //不规则数组
        int[][] d=new int[3][];
        d[0]=new int[2];
        d[1]=new int[3];
        d[2]=new int[1];
        System.out.println(d);
        System.out.println(d[0]);
        //打印杨辉三角
        int[][] q=new int[5][];
        for(int x=0;x<q.length;x++){
            q[x]=new int[x+1];
            for (int y=0;y<q[x].length;y++){
                if(y==0||x==y){
                    q[x][y]=1;
                }else {
                    q[x][y]=q[x-1][y]+q[x-1][y-1];

                }
            }

        }
        for (int[] i:q){
            for( int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        jiecheng();


    }
    //递归调用 把十进制转换为二进制
    public static  void print(int n){
        if(n/2>0){
            print(n/2);
        }
        System.out.println(n%2);
    }
    //计算1!+2!+3!+...+n!
    public static int test(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
    public static void jiecheng() {
        //使用函数计算1!+2!+3!+...+n!
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += test(i);
        }
        System.out.println(sum);
    }

}
