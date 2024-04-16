package com.kn.programs;

public class FibonacciDemo {

	public void fibonacciseries(int n) {
		int n1 = 0;
		int n2 = 1;
		if (n == 1) {
			System.out.println(n1);
		} else if (n == 2) {
			System.out.println(n2);
		} else {
			System.out.println(n1 + " " + n2);
		}
		for (int i = 3; i <= n; i++) {
			int fib = n1 + n2;
			System.out.print(fib + " ");
			n1 = n2;
			n2 = fib;
		}
	}
}
