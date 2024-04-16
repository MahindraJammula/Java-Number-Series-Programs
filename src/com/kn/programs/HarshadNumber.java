package com.kn.programs;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		boolean res = detectHarshad(num);
		if (res == true) {
			System.out.println(num + " is a Harshad Number");
		} else {
			System.out.println(num + " is not a Harshad Number");
		}

	}

	public static boolean detectHarshad(int num) {
		int original = num;
		int sum = 0;
		int digit = 0;
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		if (original % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

}
