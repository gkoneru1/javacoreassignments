package com.digitek.exercise1;

import java.util.Scanner;

public class Square {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:"+" ");
		int a = s.nextInt();
		square(a);
	}
   public static int square(int b){
	   int result = (int) Math.pow(b, 2);
	   System.out.println("The square root of "+ b +"is:"+" "+result);
	   return result;
   }
}

