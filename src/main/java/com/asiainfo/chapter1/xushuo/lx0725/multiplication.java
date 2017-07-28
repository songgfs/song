package lx0725;

/**
 * Created by root on 2017/7/25.
 * 99乘法表
 */
public class multiplication {
    public static void main(String[] args) {
        System.out.println("9*9");
        int x,y;
        for(x = 0;x <= 9; x++) {
            for (y = 1;y <= x; y++) {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
}