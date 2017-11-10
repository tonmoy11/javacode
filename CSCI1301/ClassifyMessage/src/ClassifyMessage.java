import java.util.Scanner;
public class ClassifyMessage {

	
		enum MessageCategory { NEED, OFFER, ALERT, INFO, UNKNOWN}//decalaration of enumeration
		
		public static void main(String[] args){

		/*
		* ClassifyMessage.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [06/22/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* In this program we parse the text of the user specified message, identify the category of the message, and assign
		*  and assign this to variables.
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
		
		Scanner keyboard= new Scanner(System.in);	
		
		//declaration of variables
		String catString, payload,rawCat;
		
		double latitude, longitude;
		
		boolean isInRange;
		
		MessageCategory category;
		
		double south = 39.882343;
		double west  = -105.743511;
		double east  = -104.907864;
		double north =  40.231315;
		
		
		
		
		System.out.println("Please enter a formatted message:");
		
		//user input
		catString=keyboard.next();
		rawCat=catString;
		latitude=keyboard.nextDouble();
		longitude=keyboard.nextDouble();
		payload=keyboard.nextLine();
		
		catString=catString.trim();
		payload=payload.trim();
		
		//if-else statements
		if((catString.equalsIgnoreCase("fire") ) || (catString.equalsIgnoreCase("smoke")))
		{
			category= MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need"))
		{
			category= MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer"))
		{
			category=MessageCategory.OFFER;
		}
		else if((catString.equalsIgnoreCase("structure")) ||(catString.equalsIgnoreCase("road")) ||(catString.equalsIgnoreCase("photo")) ||(catString.equalsIgnoreCase("evac")))
		{
			category=MessageCategory.INFO;
		}
		else 
		{
			category=MessageCategory.UNKNOWN;
		}
		
		
		if ((latitude>=south) && (latitude<=north) && (longitude>=west) && longitude<=east)
		{
		isInRange=true;
		}
		else  
		{
		isInRange= false;
		}
			//printing the lines of variables.
			System.out.println("Category:\t\t" + category);
			System.out.println("Raw Cat:\t\t" + rawCat);
			System.out.println("Message:\t\t" + payload);
			System.out.println("Latitude:\t\t"+ latitude);
			System.out.println("Longitude:\t\t" + longitude);
			System.out.println("In Range:\t\t"+ isInRange);
		
		
		
		keyboard.close();
		
		
		
		
	}
}