/*
		* Main.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [07/22/2015] 
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		*THis lab introduces us to fundamental concepts of Object Oriented Programming(OOP). A program consists
		* of component parts that are independent of each other and that interact in order to
		* achieve a desired result. In this case We work on classes,objects, methods,instance and variables.
		*  We work on this fundamental. The program takes input from user name, age. The program allows to give user option to choice from a list of things
		*  this lets him pick the choice.
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
		
import java.util.Scanner;

public class Main {

	/* class level variables */
	
	public static final String options = "Pick an option:\n"
			+ "1. List houses for sale\n"
			+ "2. Buy a house\n"
			+ "3. Sell your house.\n"
			+ "4. Show your profile.\n"
			+ "5. Exit\n";

	public static void main(String[] args) {
		
		// Test your code below
		
		
		// Uncomment this code to run the application
		
 
		// Instantiate houses array and the scanner
		Scanner scan = new Scanner(System.in);
		House [] houses = new House[5];
		// Fill the array of houses with random houses
		for(int i = 0; i < 5; i++) {
			houses[i] = new House();
		}
		// Prompt the user for their name, age, and amount of cash they have,
		// then instantiate a new person using these values.
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your age (in years):");
		int age = scan.nextInt();
		System.out.println("Enter the amount of money you have:");

		double cash = ((scan.nextDouble() + .0049) * 100) / 100.0; // round to two decimal places.
		// Show the users name, age, and assets using the toString() method of the Person class
		Person user = new Person(name, age, cash);
		System.out.println("You are:");
		System.out.println(user);
		
		// Display user's options and perform the action they request. 
		// If the user does not chose a valid option, print "Invalid option."
		System.out.println(options);
		int choice = scan.nextInt();
		while(choice != 5) {
			switch(choice) {
			case 1:
				// List houses for sale
				for(int i = 0; i < houses.length; i++) {
					if(houses[i].isForSale()){
						// index starting from one
						System.out.println("House " + (i + 1) + "\n" + houses[i]);
					}
				}
				break;
			case 2:
				// Buy a house
				System.out.println("Enter the number of the house to buy:");
				int houseChoice = scan.nextInt() - 1; // reduce by 1 to index from 0
				if(houseChoice >= 0 && houseChoice < houses.length) {
					user.buyHouse(houses[houseChoice]);
				} else {
					System.out.println("Invalid house number");
				}
				break;
			case 3:
				// Sell your house
				user.sellHome();
				break;
			case 4:
				// Show your profile
				System.out.println(user);
				break;
			default:
				System.out.println("Invalid option.");
			}
			System.out.println(options);
			choice = scan.nextInt();
		}
		System.out.println("Goodbye!");
	 
	}

}