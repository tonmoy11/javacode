/*
		* CircleTester.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [07/15/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* This lab introduces us to fundamental concepts of Object Oriented Programming (OOP), arguably the dominant programming
		*  paradigm in use today. In the paradigm, a program consists of component parts (objects) that are independent of each other 
		*  and that interact in order to achieve a desired result. In this we retrieve the value from the Circle.java class.
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
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1= new Circle(0.0,0.0,2);
		Circle circle2= new Circle(2.0,1.0,1);
		
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		
		System.out.println("circle1="+circle1);
				
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter: " + circle1.diameter() 
			+ " area: " + circle1.area() + " perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter: " + circle2.diameter() 
			+ " area: " + circle2.area() + " perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) 
			System.out.println("circle 1 is a unit circle");
		else 
			System.out.println("circle 1 is NOT a unit circle");
		
		// display whether circle2 is a unit circle
		if(circle1.isUnitCircle()) 
			System.out.println("circle 2 is a unit circle");
		else 
			System.out.println("circle 2 is NOT a unit circle");
		
		// your additional tests should be placed below here
		
		// test equals
		if(circle1.equals(circle2)) 
			System.out.println("circle 1 equals circle 2");
		else 
			System.out.println("circle 1 NOT equals circle 2");
		
		// test concentric
		if(circle1.isConcentric(circle2)) 
			System.out.println("circle 1 is concentric to circle 2");
		else 
			System.out.println("circle 1 is NOT concentric to circle 2");
		
		// test distance
		System.out.println("circle1 to circle2 distance: " + circle1.distance(circle2)); 
	
	    // test intersects
		if(circle1.intersects(circle2)) 
			System.out.println("circle 1 intersects circle 2");
		else
			System.out.println("circle 1 does NOT intersects circle 2");			
	}
	
}