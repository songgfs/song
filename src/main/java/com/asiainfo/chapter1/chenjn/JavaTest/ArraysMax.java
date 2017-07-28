package com.asiainfo.chapter1.chenjn.JavaTest;

import java.util.Arrays;

/**
 * Created by JN on 2017/7/26.
 */
public class ArraysMax {
    public static int arr[] = new int[10];

    public int[] CreatArr() {
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArraysMax ar = new ArraysMax();
        int arr1[] = ar.CreatArr();
        System.out.print("数组中的数据为：[");
        for (int s : ar.CreatArr()) {
            System.out.print(s + ",");
        }
        System.out.print("]" + "\n");
        Arrays.sort(arr1);
        System.out.print("最大值是：" + arr1[arr1.length - 1]);
    }
}