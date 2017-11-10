/*
		* Circle.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [07/15/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* This lab introduces us to fundamental concepts of Object Oriented Programming (OOP), arguably the dominant programming
		*  paradigm in use today. In the paradigm, a program consists of component parts (objects) that are independent of each other 
		*  and that interact in order to achieve a desired result. 
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
public class Circle {
	

	private double radius; // declare the private double instance  radius
	private double x;      // declare the private double instance  x
	private double y;      // declare the private double instance  y
	
	//----------------------------------------------
	// Class Constructor: set the initial values of
	//                    the instance variables
	//                    for this circle
	//----------------------------------------------	
	public Circle(double x, double y,double  radius) {
		setX(x);
		setY(y);
		setRadius(radius);  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		// Your code goes here	
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		// Your code goes here
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		// Your code goes here	
		return radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		// Your code goes here	
		if(x >= 0)
			this.x = x;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		// Your code goes here
		if(y >= 0)
			this.y=y;	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		// Your code goes here
		if(radius >= 0)	
			this.radius = radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		// Your code goes here	
		double diameter = radius * 2;
		return diameter;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		// Your code goes here	
		double area = Math.PI * radius * radius;
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		// Your code goes here	
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		// Your code goes here
		return x ==0 && y==0 && radius == 1;	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		// Your code goes here	
		return "center: (" + x + "," + y + ") radius: " + radius;
	}


// This	 method	 returnS true when the radius and centers of both circles	
// are the same otherwise,it returns false
public boolean equals(Circle anotherCircle) 
{
	return x == anotherCircle.x && y==anotherCircle.y && radius == anotherCircle.radius;
}


// The method isConcentric returns true	when the circle	executing the method has the same	
// center as anotherCircle
public boolean isConcentric(Circle anotherCircle)
{
	return x == anotherCircle.x && y==anotherCircle.y;
}

// This	method returns the distance	between	the	centers of the circle executing	
// the method and anotherCircle
public double distance(Circle anotherCircle)
{
	double distance = Math.sqrt(Math.pow(x-anotherCircle.x,2) + Math.pow(y-anotherCircle.y,2));
	return distance;
}

// The method intersects returns true when the circle executing	the	 method	and	anotherCircle
// have	anintersecting	area ( one or more points enclosed by both circles) otherwise it	
// returns	 false
// Two circles intersect if	the distance between the centers of	the	two	circles	
// is less than	the	sum	of their radius
public boolean intersects(Circle anotherCircle)
{
	double distance = distance(anotherCircle);
	double sum = radius + anotherCircle.radius;
	return distance < sum;
	
}

} // end class Circle