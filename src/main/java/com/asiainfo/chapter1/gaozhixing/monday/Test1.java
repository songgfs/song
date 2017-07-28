package main.java.com.asiainfo.chapter1.gaozhixing.monday;

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组
		System.out.print("数组：");
		int[] num =new int[10];
		for(int i=0;i<10;i++){
			num[i]=i;
			System.out.print(num[i]+" ");
		}
		System.out.println("");
		//运算符
		System.out.println(1+4>5?true:false);
		//函数
		HelloWorld();	
		//递归
		MinusNum(10);
		//卫语句
		int year=2002;
		if(year%400==0){
			System.out.println("今年为润年");
		}
		if(year%4==0&&year%100!=0){
			System.out.println("今年是润年");
		}
		//类型转换
		int a=2;
		byte c=(byte)a;
		System.out.println(c);
		//自动装箱
		Integer i=10;
		Integer i2= new Integer(10);
		System.out.println(i-i2>0?true:false);
		//StringBuffer
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb.toString());
		String str="Hello";
		str=str+"World";
		System.out.println(str.toString());
		//控制语句
		int number=15;
		switch (number) {
		case 5:
			System.out.println("5");
			break;
		case 10:
			System.out.println("10");
		default:
			System.out.println("Null");
			break;
		}
	}
	public static void HelloWorld(){
		System.out.println("HelloWorld");
	}
	public static void MinusNum(int num){
		if(num==0){
			System.out.println("");
			return ;
		}
		System.out.print(num+" ");
		MinusNum(num-1);
	}
}
