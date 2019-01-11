package com.test.example;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 2000000;
		sumNthPrime(n);
	}
	
	public static void sumNthPrime(long n) {
		long num = 2;
		long sum = 0;
		while(num < n){
			int flag = 0;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i == 0){
					flag = 1;
				}
			}
			if(flag == 0){
				//System.out.println(num);
				sum += num;
			}
			num++;
		}
		System.out.println(sum);
	}

}
