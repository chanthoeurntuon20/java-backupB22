package com.Demo;

public class Practice {

	public static void main(String[] args) {
	///////////////////////////////////
//		System.out.println("hello");
//		int number1 = 10;
//		String name = "dara";
//		double number2 = 20.0;
//	iSystem.out.println(number1+"\n" + name+ "\n"+ number2);
///////////////////////////////////////		
//		int n = 10;
//		int m = 3;
//		int result = 10/3;
//		System.out.println(result);
//	}
///////////////////////////////////////
//		for(int i = 1; i<= 5; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		
//		}
//////////////////////////////////////
//		int i = 0;
//		while(i <= 9) {
//			System.out.println(i);
//			i++;
//		}
/////////////////////////////////////
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
//		int number[] = {1,3,5,9};
//		for(int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}
//////////////////////////////
//		String name[] = {"dara","mey"};
//		
//		for(String stu:name) {
//			System.out.println(stu);
//		}
		
///////////////////////////////////
		Demo test = new Demo();
		test.test();
		
		Demo1 child = new Demo1();
		child.child();
		child.test();
}
}
class Demo{
	public void test() {
		System.out.println("I am a girl");
	}
}
//class Demo1 extends Demo{
//	public void child() {
//		System.out.println("I am a boy");
//	}
//}