package luhui;

public class Main {

    public static void main(String[] args) {
	int[] arr=new int[]{23,43,123,24,15,1,16};
      int temp;
        for (int i=0;i<arr.length;i++){//for循环，当i<arr数组长度时，执行for循环内语句，并且每循环一次，i++；
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){//使用if条件语句将arr[i]和arr[j]进行比较。
                    temp=arr[i];//比较值较大的，并调换位置。
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("按从小到大的顺序排列:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
