package com.kn.programs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		boolean res =detectAutomorphic(num);
		if (res == true) {
			System.out.println(num + " is Automorphic Number");
		} else {
			System.out.println(num + " is not a Automorphic Number");
		}

	}

	public static boolean detectAutomorphic(int num) {
		int square = num * num;
		while (num != 0) {
			if (num % 10 != square % 10) {
				return false;
			}
			num = num / 10;
			square = square / 10;
		}
		return true;
	}
}
