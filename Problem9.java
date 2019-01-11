package com.test.example;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyTriplet();
	}

	public static void pyTriplet() {
		int a = 3;
		int b = 4;
		double c = Math.sqrt((a * a) + (b * b));
		if ((c * 10) % 10 == 0) {
			while (a < 1000) {
				while (b < 1000) {
					c = Math.sqrt((a * a) + (b * b));
					if ((c * 10) % 10 == 0) {
						//System.out.println(c);
						if (a + b + c == 1000.0) {
							int temp = (int) c;
							System.out.println(a+"   "+b+"   "+temp+"   "+a*b*temp);
							//break;
						}
					}
					b++;
				}
				if ((int) (a + b - 1 + c) == 1000) {
					
					//break;
				}
				b = a+1;
				a++;
			}
		}
		

		

	}

}
