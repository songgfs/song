package lx0725;
import java.util.Scanner;
/**
 * Created by root on 2017/7/25.
 * 成绩等级输出程序
 */
public class grade {
    public static void main(String[] args) {
        System.out.println("请输入该学员的分数（0-100)：");
        Scanner scanner = new Scanner(System.in);
        int price=scanner.nextInt();
        scanner.close();
        if(price<0 || price>100) {
            System.out.println("请输入0到100以内的分数");
        }
        else if (price >= 90.0 & price<=100) {
            System.out.println("A");
        }
        else if (price >=80.0) {
            System.out.println("B");
        }
        else if (price >=60.0) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
