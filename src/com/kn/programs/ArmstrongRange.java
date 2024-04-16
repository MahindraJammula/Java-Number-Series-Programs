package com.kn.programs;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number1 = ");
		int n1 = sc.nextInt();
		System.out.print("Enter a number2 = ");
		int n2 = sc.nextInt();
		int serial = 1;
		for (int i = n1; i <= n2; i++) {
			int count = 0;
			int temp = i;
			while (temp != 0) {
				count++;
				temp = temp / 10;
			}
			int sum = 0;
			temp = i; 
			while (temp != 0) {
				int lastdigit = temp % 10;
				int exp = 1;
				for (int a = 1; a <= count; a++) {
					exp = exp * lastdigit;
				}
				sum = sum + exp;
				//count--;           //Disarium number
				temp = temp / 10;
			}
			if (sum == i) {
				System.out.println(serial + ". " + i);
				serial++;
			}
		}
	}
}