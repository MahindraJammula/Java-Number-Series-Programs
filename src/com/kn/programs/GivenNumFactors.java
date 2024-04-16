package com.kn.programs;

import java.util.Scanner;

public class GivenNumFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum=sum+i;
				//System.out.print(i + " ");
			}
		}
		System.out.println();
		if(n!=sum) {
			System.out.println(n+" is a prefect number");
		}else {
			System.out.println(n+" is not a perfect number");
		}
	}
}
