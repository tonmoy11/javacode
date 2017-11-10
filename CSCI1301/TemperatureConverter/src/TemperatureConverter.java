/*
	* TemparatureConverter.java
	* Author: Tonmoy Mohammed Iskander
	* Submission Date: 06/29/2015 *
	* Purpose: A brief paragraph description of the
	* program. What does it do? *
	* This program allows user to covert temparature from one value to another by conversion method.
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

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees = 0;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 if (fahrenheit < MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
	 }
 
	 System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
	 
	 if (tempScale>4 && tempScale==0) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT)*5/9;
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32)*4/9 ; // Set a breakpoint here
			 tempScaleStr="Reaumer";
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32)*5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}