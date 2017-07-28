package test.springMVC.pojo;

public class JavaTest {
	
	int abs = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=3,number2=2;
		boolean mat=true,mar=false;
		JavaTest jt=new JavaTest();
		
		//数组
		int []tr={1,2,3,4,5};
		for(int i:tr){
			System.out.println(i+" ");
		}
		
		//运算符
		System.out.println("number1-number2="+(number1-number2));
		System.out.println("number1+number2="+(number1+number2));
		System.out.println("number1*number2="+(number1*number2));
		System.out.println("number1/number2="+(number1/number2));
		System.out.println("mat & mar="+(mat & mar));
		System.out.println("mat || mar="+(mat || mar));
		
		//控制语句
		jt.switchTest();
		
		//递归
		System.out.println("递归次数："+jt.recursive(5));
		
		//String,StringBuffer
		StringBuffer str1=new StringBuffer("hello");
		System.out.println(str1.append(str1));

	}
	
	//switch
	public void switchTest(){
		
		int a = 1;
		switch(a){
		case 1: System.out.println("a=1");
		case 2: System.out.println("a=2");
		case 3: System.out.println("a=3");
		default: System.out.println("a=4");
		}
		
	}
	
	public int recursive(int a){
		--a;
		abs++;
		if(a>0){
			recursive(a);
		}
		return abs;
		
	}

}
