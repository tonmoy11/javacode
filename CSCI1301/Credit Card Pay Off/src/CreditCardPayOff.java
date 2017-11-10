import java.util.Scanner;// Import of scanner helps us to provide input form keyboard.

public class CreditCardPayOff {

	public static void main(String[] args) {
		/*
		* CreditCardPayOff.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [06/17/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* =>This program allows us to compute the time in month required to pay off Credit Card. We further compute total amount paid, total interest
		* paid and overpayment.
		* 
		* 
		* Statement of Academic Honesty: *
		* The following code represents my own work. I have neither
		* received nor given inappropriate assistance. I have not copied
		* or modified code from any source other than the course webpage
		* or the course textbook. I recognize that any unauthorized 
		* * assistance or plagiarism will be handled in accordance with 
		* * the University of Georgia's Academic Honesty Policy and the * policies of this course. I recognize that my work is based * on an assignment created by the Department of Computer
		* assistance or plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and the * policies of this course. I recognize that my work is based * on an assignment created by the Department of Computer
		* Science at the University of Georgia. Any publishing
		* or posting of source code for this project is strictly
		* prohibited unless you have written consent from the Department * of Computer Science at the University of Georgia.
		*/
		
		//These are declaration  of variables that are used for calculation

		double principal, annualInterestRate, monthlyPayment;
		double monthsNeededToPayOff, totalAmountPaid, totalInterestPaid,overpayment;
		double a,b,c;//equation from months needed to payoff are splitted into 3 different parts to simplify.
	
	
		Scanner keyboard= new Scanner(System.in);			//input from keyboard.
		
		System.out.println("Principal:\t\t\t");
	 principal= keyboard.nextDouble();						//user provides input for principal.

	 System.out.println("Annual Interest Rate(%):\t\t\t");	 
	 annualInterestRate=keyboard.nextDouble();				//user input for interest rate.
	 
	 System.out.println("Monthly Payment:\t\t\t"); 
	 monthlyPayment=keyboard.nextDouble();					//user input for monthly payment.
	
	 //These  bottom are the equations separated to calculate months needed to payoff. They are 
	 //are assigned by a,b,c. 
	a=Math.log(monthlyPayment);
	b=Math.log(monthlyPayment-(annualInterestRate/1200.00)*principal);
	c=Math.log((annualInterestRate/1200.00)+1.00);
	
	monthsNeededToPayOff=(a-b)/c;    						//the equation is simplified to calculated 	months needed to payoff.
	totalAmountPaid=monthlyPayment*	monthsNeededToPayOff;
	totalInterestPaid=totalAmountPaid-principal;

	//Math.ceil is used to provide numbers to 2 decimal 
	totalAmountPaid=Math.ceil(monthsNeededToPayOff)*monthlyPayment; //math.ceil helps to provide a whole number for all these equations.
	totalInterestPaid=(Math.ceil(monthsNeededToPayOff)*monthlyPayment)-principal; 
	overpayment=(Math.ceil(monthsNeededToPayOff)*monthlyPayment)- (monthlyPayment*monthsNeededToPayOff);
		
	
		System.out.print("Months Needed To Pay Off:\t\t");
		System.out.println((int)(Math.ceil( monthsNeededToPayOff)));//type casting is used to provide integers.
		System.out.printf("Total Amount Paid:\t\t\t$%.2f\n",totalAmountPaid);
		System.out.printf("Total Interest Paid;\t\t\t$%.2f\n",totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t\t$%.2f",overpayment);
		
		// from sample pdf :Calculation of overpayment: user inputs principal, annual interest rate,monthly payment.
		//principal=5000, annual interest rate=15, monthly payment=100.
		//months needed to be calculated in code and calculator=78.95, which we multiply with monthly payment to get 7895.57
		//Our months needed to payoff and total amount paid are rounded thats we we get, 79 and 7900.
		//Overpayment=7900.00-7895.57=4.43
		
		keyboard.close();

		        
		}
	

        
	
	}