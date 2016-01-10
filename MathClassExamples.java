package com.digitek.mathclass;

public class MathClassExamples {

	public static void main(String[] args) {
	
		squareRoot(4.00);
		findMax(10,2);
		round(12.9f);
		exp(8.1d);
		pow(2.3d,4.5d);
		
	}
    public static double squareRoot(double number){
		double result = Math.sqrt(number);
		System.out.println("The square root is:" +" "+ result);
		return result;
    }
    public static int findMax(int no1, int no2){
    	int result= Math.max(no1,no2);
    	System.out.println("The maximum number is:" +" "+ result);
    	return result;
    }
    public static int round(float no){
    	int result= Math.round(no);
    	System.out.println("The round of the number is:"+" "+ result);
    	return result;
    }
    public static double exp(double no){
    	double result= Math.exp(no);
    	System.out.println("The exponent of the value is:"+" "+ result);
    	return result;
    }
    public static double pow(double a,double b){
    	double result= Math.pow(a,b);
    	System.out.println("The power is:"+" "+ result);
    	return result;
    }
    
    }

