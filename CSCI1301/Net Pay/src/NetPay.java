import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		
		/*
		* [NetPay].java
		* Author: [Tonmoy M. Iskander]
		* Submission Date: [06/14/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do? *
		* => The purpose of the program is to determine the wage, tax of an employee.
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
//declaration of variables
 final double FEDERAL_TAX_PERCENT=10.00;
 final double STATE_TAX_PERCENT=4.5;
 final double SS_PERCENT=6.2;
 final double MEDICARE_PERCENT= 1.45;
 final double PAY_PER_HOUR=7.25;
	
int hoursPerWeek;

double grossPay, stateTax, netPay, medicare, federalTax, socialSecurity;


Scanner keyboard = new Scanner(System.in);

//main codes
System.out.println("ENTER NUMBER OF WEEKS");
hoursPerWeek=keyboard.nextInt();
grossPay=hoursPerWeek * PAY_PER_HOUR;

federalTax=(grossPay * FEDERAL_TAX_PERCENT)/100;

stateTax=(grossPay * STATE_TAX_PERCENT)/100;

socialSecurity=(grossPay * SS_PERCENT)/100;

medicare=(grossPay* MEDICARE_PERCENT)/100;

netPay= grossPay-(socialSecurity+medicare+stateTax+federalTax);

//Codes that will be executed on console as output:

System.out.println("Hours Per Week:\t\t"+ hoursPerWeek);

System.out.println("Gross Pay:\t\t" + grossPay);

System.out.println("Net Pay:\t\t"+netPay);

System.out.println();

System.out.println("Deductions");

System.out.println("Federal:\t\t" + federalTax);

System.out.println("State:\t\t\t"+stateTax);

System.out.println("Social Security:\t"+ socialSecurity);

System.out.println("Medicare:\t\t"+medicare);
keyboard.close();
	
	}

}


