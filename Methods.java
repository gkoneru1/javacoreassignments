package com.digitek.exercise1;

public class Methods {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		method1();
		method2( a, b);
		int method3Answer= method3(9,10);
		System.out.println(method3Answer);
		int result= method4();
		System.out.println(result);
	}

	public static void method1(){
		int c= a+b;
		System.out.println("The value of c is:"+" "+c);
	}
	public static void method2(int c, int d){
		int e=c+d;
		System.out.println("The value of e is:"+" "+e);
	}
	public static int method3(int c, int d){
		int f=c+d;
		return f;
	}
	public static int method4(){
		int g= a+b;
		return g;
	}
}
