package com.kn.programs;

import java.util.Scanner;//0 1 1 2 3 5 8 13........

public class FibonacciSeries1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		FibonacciDemo series=new FibonacciDemo();
				series.fibonacciseries(n);
	}
}
 