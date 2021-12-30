package com.learn.code;



public class Addition {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int sum = addTwoNumbers(a, b);
		int difference = subtractTwoNumbers(a, b);
		System.out.println("The Sum is :" + sum);
		System.out.println("The Difference is :" + difference);

	}

	public static int addTwoNumbers(int a, int b) {

		int result = a + b;
		return result;
	}

	public static int subtractTwoNumbers(int a, int b) {

		int sum = a - b;
		return sum;
	}
}
