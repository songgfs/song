/**
 * Created by 陆辉 on 2017/7/24.
 */
public class iterative {
public static void main(String[] args){
       int sum=0;
    for(int n=0;n<50;n++){//for循环执行内部语句
    if(n==1){
        sum=1;
    }
    else{
        sum+=n;//sum=sum+n;进行运算
    }}
    System.out.println(sum);
}

}