package com.digitek.exercise1;

import java.util.Scanner;

public class EvenOdd {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value:"+" ");
			int a = s.nextInt();
			evenOdd(a);
	}
   public static boolean evenOdd(int a){
	   boolean flag = true;
	   if(a%2==0){
		   System.out.println(flag);
	   }else{
		   flag=false;
		   System.out.println(flag);
	   }
	   return flag;
   }
}
