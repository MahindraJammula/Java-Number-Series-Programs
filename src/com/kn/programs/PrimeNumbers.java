package com.kn.programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		if (n > 1) {
			boolean isPrime = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(n + " is prime number");
			} else {
				System.out.println(n + " not a prime number");
			}
		} else {
			System.out.println(n + " not a prime number");
		}
	}
}
