/**
 * Created by 18237161432 on 2017/7/24.
 */
public class recursion {
    int sum=0;
    int a=1;
    public void sum()
    {
        sum+=a;
        a++;
        if(a<=1000)
        {
            sum();//调用自身实现递归
        }
    }
    public static void main(String[] args) {
        recursion test=new recursion();
        test.sum();
        System.out.println("计算结果："+test.sum+"!");
    }
}
