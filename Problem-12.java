package com.test.example;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleCode();
	}
	
	public static void simpleCode(){
		
		int num = 1;
		int counter = 2;
		int flag = 0;
		int factors = 2;
		while(flag == 0){
			num += counter;
			counter++;
			int temp = 2;
			int temp2 = num;
			while(temp < temp2){
				//System.out.println(temp2);
				if(num%temp == 0){
					factors += 2;
					temp2 = num/temp;
				}
				temp++;
			}
			if(factors > 500){
				//System.out.println(factors);
				System.out.println(num);
				flag = 1;
			}
			factors = 2;
		}
	}

}
