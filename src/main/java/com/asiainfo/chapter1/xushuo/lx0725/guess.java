package lx0725;
import java.util.Scanner;
/**
 * Created by root on 2017/7/25.
 * 猜数字游戏
 */
public class guess {
    public static void main(String[] args) {
        int number = 233;
        System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != number) {
            if(guess == 0){
                break;
            }
            else if (guess > number) {
                System.out.println("太大了!");
            }
            else if (guess < number) {
                System.out.println("太小了!");
            }
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            guess = scanner.nextInt();
        }
        if(guess == number) {
            System.out.println("恭喜，你猜对了!");
        }else{
            System.out.println("真遗憾，下次再挑战吧!");
        }
        scanner.close();
    }
}