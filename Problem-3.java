package com.test.example;

public class Problem3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600851475143L;
		execute(num);
	}
	
	public static void execute(long num){
		long temp = 2;
		long temp2 = num;
		int i = 0;
		int flag1 = 0;
		long output = 0;
		while(temp < temp2){
			//System.out.println(temp2);
			if(num%temp == 0){
				if(isPrime(temp)){
					output = temp;
				}
				temp2 = num/temp;
				if(isPrime(temp2) && flag1 == 0){
					flag1 = 1; 
					output = temp2;
				}
			}
			temp++;
		}
		System.out.println(output);
	}
	
	public static boolean isPrime(long num) {
		long temp = 2;
		boolean flag = true;
		while(temp < Math.sqrt(num)){
			if(num%temp == 0){
				flag = false;
			}
			temp++;
		}
		return flag;
	}

}
