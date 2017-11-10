/*
	Palindrove.java
 * Author: Tonmoy Mohammed Iskander
 * Submission Date: 06/29/2015 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? *
 * This program checks whether the input value or ineger is palindrome or not.
 * Statement of Academic Honesty: *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. */

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]){

		Scanner keyboard= new Scanner(System.in);
		//user input integer for palindrome.
		System.out.println("Please enter an integer > 0 : ");
		int palindrome = keyboard.nextInt();
		int sum,count,c;
		count=0;
		c=count((count+1)/2);

		
		
		
		if(isPalindrome(palindrome))
		{
			System.out.println("The integer : " + palindrome + " is a palindrome");
		
			while(count<=palindrome)
			{
				c= (count+1)/2*count;//formula of summatiob
				count++;
			}
			System.out.println("The sum from 1 to "+ palindrome +" is:  " + c);
		}
		else
		{
			System.out.println("Number : " + palindrome + " is not a palindrome");
		}       

	}
	//method to check if number is palindrome or not



	private static int count(int i) {
	
		return 0;
	}
	private static boolean isPalindrome(int number) 
	{
		int palindrome = number; // copied number into variable
		int reverse = 0;
		int remainder;

		while (palindrome != 0) 
		{
			remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome 
		if (number == reverse) 
		{
			return true;
		}else
			return false;

	}
}

