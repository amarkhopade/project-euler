package com.test.example;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10001;
		nthPrime(n);
	}
	
	public static void nthPrime(int n) {
		int counter = 0;
		int num = 2;
		while(counter != n){
			int flag = 0;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i == 0){
					flag = 1;
				}
			}
			if(flag == 0){
				//System.out.println(num);
				counter++;
			}
			num++;
		}
		System.out.println(num-1);
	}

}
