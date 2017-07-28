package lx0725;
import java.util.Scanner;
/**
 * Created by root on 2017/7/25.
 * 随机加法运算器
 */
public class addition {
    public static void main(String[] args) {
        System.out.println("将开始10次加法测试...");
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        for (int i = 1; i < 11; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int sum = a + b;
            System.out.println("("+i+") ."+a+"+"+b+"=?");
            System.out.println("请输入答案（输入-1退出）：");
            int guess = scanner.nextInt();
            if(guess == -1){
                break;
            }
            else if (guess != sum){
                System.out.println("Error！");
                continue;
            }
            else{
                x=x+10;
                System.out.println("Correct！");
            }
        }
        scanner.close();
        System.out.println("此次测验结束，你的分数是：" + x);
    }
}
