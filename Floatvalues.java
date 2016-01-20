package com.digitek.exercise1;

import java.util.Scanner;

public class Floatvalues {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first float value a:"+" ");
		float a = s.nextFloat();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the second float value b:"+" ");
		float b = s1.nextFloat();
		add(a,b);
	}
   public static void add(float a, float b){
	   float result= a+b;
	   a=result;
	   System.out.println("The value of the first variable a is:"+" "+a);
	   
   }
}
