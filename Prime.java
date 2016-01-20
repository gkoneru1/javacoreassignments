package com.digitek.exercise1;



import java.util.Scanner;

public class Prime {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);                 
		System.out.println("Enter the Number:");  
		int input=s.nextInt();                    
		
		boolean result=isPrime(input);
		System.out.println(result);
	}
	
	public static boolean isPrime(int n){  
		
		if (n <= 0) {                  
			return false;
		}
		int sqrtN = (int) Math.sqrt(n);
		boolean isPrime = true;

		for (int k=2; k <= sqrtN;k=k+1) {
			
			if (n % k == 0) {
				isPrime = false;
				break;
			}			
		}
		return isPrime;		

	}

}
