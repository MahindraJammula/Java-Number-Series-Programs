package com.kn.programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		int fact = 1;
		while(n>0) {
			int i=1;
			fact = fact * i;
		}
		int temp = n;
		int sum = 0;
		int digit = 0;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + fact;
			temp = temp / 10;
		}
		
		if (sum == n) {
			System.out.println(n + " is strong number");
		} else {
			System.out.println(n + " is not a strong number");
		}
	}
}
