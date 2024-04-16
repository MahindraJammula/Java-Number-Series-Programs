package com.kn.programs;

import java.util.Scanner;

public class FriendlyPairs {// Amicable NUmber

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1 = ");
		int num1 = sc.nextInt();
		System.out.println("Enter a number 2 = ");
		int num2 = sc.nextInt();
		int sum1 = findsum(num1);
		int sum2 = findsum(num2);
		int res1 = sum1 / num1;
		int res2 = sum2 / num2;
		if (res1 == res2) {
			System.out.println(num1 + " " + num2 + " is friendly pairs");
		} else {
			System.out.println(num1 + " " + num2 + " is not friendly pairs");
		}

	}

	public static int findsum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
