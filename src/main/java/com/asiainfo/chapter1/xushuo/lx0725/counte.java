package lx0725;
import java.util.Scanner;
/**
 * Created by root on 2017/7/25.
 * 收银柜台收款程序
 */
public class counte {
    public static void main(String[] args) {
        System.out.println("请输入单价(¥)：");
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        System.out.println("请输入数量(¥)：");
        int number = scan.nextInt();
        System.out.println("请输入金额（¥）");
        double money = scan.nextDouble();
        double ysmoney = price * number;
        // 进行判断，当金额大于500元的时候，就可以打折
        if (ysmoney > 500) {
            ysmoney = ysmoney * 0.8;
        }
        double zlmoney = money - ysmoney;
        System.out.println("应收金额为:¥" + ysmoney +",找零为：¥"+zlmoney);
        scan.close();
    }
}
