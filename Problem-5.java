package com.test.example;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long [] numbers = new long[10];
		long num = 1;
		int temp = 1;
		while(temp < 21){
			if(isPrime(temp)){
				//numbers[temp-1] = temp;
				num *= temp;
				//i++;
			}
			temp++;
		}
		int temp1 = 2;
		int temp2 = 2;
		while(temp1 < 21 && isPrime(temp1)){
			if((temp1 * temp1) < 21){
				while(temp2 < 21){
					temp2 *= temp1;
					
				}
				num = num*(temp2/(temp1*temp1));
			}
			temp1++;
			temp2 = temp1;
		}
		System.out.println(num);
	}
	
	public static boolean isPrime(long num) {
		long temp = 2;
		boolean flag = true;
		while (temp <= Math.sqrt(num)) {
			if (num % temp == 0) {
				flag = false;
			}
			temp++;
		}
		return flag;
	}

}
