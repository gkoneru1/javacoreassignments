package com.digitek.exercise1;

import java.util.Scanner;

public class Basicmath {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first integer value:"+" ");
		int a = s.nextInt();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the second integer value:"+" ");
		int b = s1.nextInt();
		addition(a,b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);
		
	}
    public static void addition(int a, int b){
    	int c= a+b;
    	System.out.println("Addition result is:"+" "+c);
    }
    public static void subtraction(int a, int b){
    	int c= a-b;
    	System.out.println("Subtraction result is:"+" "+c);
    }
    public static void multiplication(int a, int b){
    	int c= a*b;
    	System.out.println("multiplication result is:"+" "+c);
    }
    public static void division(int a, int b){
    	int c= a/b;
    	System.out.println("Division result is:"+" "+c);
    }
}
