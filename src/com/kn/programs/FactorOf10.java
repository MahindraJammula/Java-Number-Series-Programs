package com.kn.programs;

import java.util.Scanner;

public class FactorOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		boolean res = isfactor(n);
		if (res == true) {
			System.out.println("Enter the number " + n + " is factor of 10");
		} else {
			System.out.println("Enter the number " + n + " is not the factor of 10");
		}
	}

	public static boolean isfactor(int n) {
		if (10 % n == 0) {
			return true;
		} else {
			return false;
		}
	}
}
