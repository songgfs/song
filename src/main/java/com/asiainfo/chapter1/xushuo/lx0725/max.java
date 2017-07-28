package lx0725;
import java.util.Random;
import java.util.Arrays;
/**
 * Created by root on 2017/7/25.
 * 求数组最大数
 */
public class max {
        public static void main(String[] args) {
            int[] arrays =new int[10];
            Random random = new Random();
        for (int i = 0; i<arrays.length; i++) {
            arrays[i] =random.nextInt(100);
        }
            System.out.println("数组中的数据为：" + Arrays.toString(arrays));

            int max = arrays[0];
            for(int i=1; i<arrays.length; i++) {
                if(max < arrays[i]) {
                    max = arrays[i];
                }
            }
            System.out.println("最大值是：" + max);
        }
}

