package com.test.example;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		palin3digit(n);
	}
	
	public static void palin3digit(int numOfDigits) {
		String start = "1";
		String end = "9";
		while(numOfDigits > 1){
			start = start.concat("0");
			end = end.concat("9");
			numOfDigits--;
		}
		int output = 0;
		int st = Integer.parseInt(start);
		int en = Integer.parseInt(end);
		int prod = 0;
		while(en > st){
			int temp = en-1;
			while(temp > st){
				prod = en * temp;
				if(isPalindrome(Integer.toString(prod))){
					if(output < prod){
						output = prod;
					}
				}
				temp--;
			}
			en--;
		}
		System.out.println(output);
	}
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int count = 0;
		int j = str.length()-1;
		while(i < j){
			if(str.charAt(i) == str.charAt(j)){
				count++;
			}
			i++;
			j--;
		}
		if(count == str.length()/2){
			return true;
		}else{
			return false;
		}
	}

}
