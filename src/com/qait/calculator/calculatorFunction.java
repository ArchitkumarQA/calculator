package com.qait.calculator;

public class calculatorFunction {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	public static int substraction(int a, int b) {
		if(a<b) {
			System.out.println("b is greater then a so reversing the affect");
			System.out.println("123");
			return b-a;
		}else
		return a-b;
	}

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		
		System.out.println(substraction(5, 2));
		System.out.println(substraction(3, 5));
	}

}
