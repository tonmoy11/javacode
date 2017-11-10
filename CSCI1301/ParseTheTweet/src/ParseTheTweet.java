import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
	
		/*
		* ParseTheTweet.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [06/22/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* In this project we are parsing or extracting portions of strings from the entire string.
		* We do this by using string method such as indexOf and substring to extract and allocate to 
		* the portions to their designated form.
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
		
		System.out.println( "Enter your Tweet:");
		String tweet = keyboard.nextLine();//user are expected to write down their string here.
		//decalaration of variables.
		String typ, loc, det, lat, lng; //type,location, detail,latitude,longitude.		
		int start, finish;
		
		start = tweet.indexOf("#typ"); //Type
		finish = tweet.indexOf(";");
		typ=tweet.substring(5,finish);
		System.out.println("Type:\t\t\t" + typ.toUpperCase());
		
		

		start = tweet.indexOf("#det");//detail
		tweet=tweet.substring(start);
		finish=tweet.indexOf(";");
		det=tweet.substring(5,finish);
		System.out.println("Detail:\t\t\t"+ det);
		
		
		start=tweet.indexOf("#loc");//location
		tweet=tweet.substring(start);
		finish=tweet.indexOf(";");
		loc=tweet.substring(5,finish);
		System.out.println("Location:\t\t" + loc);
		
		
		start=tweet.indexOf("#lat");//latitude
		tweet=tweet.substring(start);
		finish=tweet.indexOf(";");
		lat=tweet.substring(5,finish);
		System.out.println("Laitutde:\t\t"+ lat);
	
		
		start=tweet.indexOf("#lng");//longitude
		tweet=tweet.substring(start);
		finish=tweet.indexOf(";");
		lng=tweet.substring(5,finish);
		System.out.println("Longitutde:\t\t" + lng);
	
	keyboard.close();
	}

}
