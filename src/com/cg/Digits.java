package com.cg;

public class Digits {

	public static void main(String[] args) {


				  String str = "1234";

		 

			        char[] charArray = str.toCharArray();

		 

			        int sum = 0;

		 

			        for (char c : charArray) {

		 

			            if (Character.isDigit(c)) {

		 

			               int digit = Character.getNumericValue(c);

		 

			                sum += digit;

		 

			            }

		 

			        }

		 

			        System.out.println("Sum of digits in the string: " + sum);

		 

			    }

		 

		 

			

		 

	}


