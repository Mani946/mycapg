package com.cg;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		String Str = Integer.toString(n);
		int count = Str.length();
		char[] digits = Str.toCharArray();
		System.out.println("Digits of the number " + n + ":");
		for (char digit : digits) {
			System.out.println(digit+ " ");
		}
		}
		
			

	}



