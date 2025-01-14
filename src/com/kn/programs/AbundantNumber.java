package com.kn.programs;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = sc.nextInt();
		boolean res = detectAbundant(num);
		if (res == true) {
			System.out.println(num + " is Abundant Number");
		} else {
			System.out.println(num + " is not a Abundant Number");
		}

	}

	public static boolean detectAbundant(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum > num) {
			return true;
		} else {
			return false;
		}
	}
}
