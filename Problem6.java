package com.test.example;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		variation(n);
	}
	
	public static void variation(int n) {
		int sum = (int) Math.pow(((n*(n+1))/2),2);
		int sumOfSquares = (int) (n*(n+1)*(2*n+1))/6;
		
		System.out.println(sum - sumOfSquares);
	}

}
