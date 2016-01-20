package com.digitek.exercise1;
import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		palindrome(n);
		
	}
	
	public static int palindrome(int n){
	
		int original=n;
		int reverse=0;
		
		while(n!=0){			
			int r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		if(original==reverse){
			System.out.println("Its a palindrome");
			return original;
		}
		else{
			System.out.println("Its not a palindrome");
			return 0;
		}
	
	}
}

