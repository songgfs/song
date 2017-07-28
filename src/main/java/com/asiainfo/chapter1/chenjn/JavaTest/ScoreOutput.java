package com.asiainfo.chapter1.chenjn.JavaTest;

import java.util.Scanner;

/**
 * Created by JN on 2017/7/26.
 */
public class ScoreOutput {
    public static Scanner scanner = new Scanner(System.in);
    public static double score;

public  String ScoreClassify(double score){
if (score>=90){
    return "A";
}
if (score>=80&&score<90){
    return "B";
}
if (score>=60&&score<80){
    return "C";
}
if (score<60){
    return "D";
}
    return null;
}
    public static void main(String[] args){
    ScoreOutput so = new ScoreOutput();
    for (int i=0;i<10;i++){
    System.out.print("请输入该学员的分数:"+"\n");
    score = scanner.nextDouble();
    if (score>100||score<0){
        System.out.print("请输入0~100以内的分数"+"\n");
    }
else
System.out.print(so.ScoreClassify(score)+"\n");
    }
}
}
