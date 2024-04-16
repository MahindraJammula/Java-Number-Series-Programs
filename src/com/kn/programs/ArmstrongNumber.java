package com.kn.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int res = countNumber(num);
		if (res == num) {
			System.out.println("it is a armstrong number ");
		} else {
			System.out.println("It is not a armstrong number");
		}
	}

	static int countNumber(int num) {
		int sum = 0;
		int lastDigit; // 153
		while (num > 0) {
			lastDigit = num % 10;
			sum += lastDigit * lastDigit * lastDigit;
			num = num / 10;
		}
		return sum;
	}
}
