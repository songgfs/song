package lx0725;
import java.util.Arrays;

/**
 * Created by root on 2017/7/25.
 * 冒泡排序
 */
public class bubbling {
        public static void main(String[] args) {
            int[] arrays = {8,54,17,11,97,68,72,75,22,75 };
            System.out.println("---冒泡开始----");
            for (int i = 0; i < arrays.length - 1; i++) {//外层循环控制排序趟数
                for (int j = 0; j < arrays.length - 1 - i; j++) {// 内层循环控制每一趟排序多少次
                    if (arrays[j] > arrays[j + 1]) {
                        int temp = arrays[j];
                        arrays[j] = arrays[j + 1];
                        arrays[j + 1] = temp;
                    }
                }
                System.out.println(Arrays.toString(arrays));
            }
            System.out.println("----冒泡结束----");
            System.out.println(Arrays.toString(arrays));
        }
    }