package com.animesh.recursion;

public class Factorial {

	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}
	public static void main(String[] args) {
		
		int value =factorial(6);
		System.out.println("Factioral of 6 -:"+value);

	}

}
