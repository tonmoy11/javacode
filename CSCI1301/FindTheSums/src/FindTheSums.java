/*
		* FindTheSums.java
		* Author: Tonmoy Mohammed Iskander
		* Submission Date: [07/28/2015] *
		* Purpose: A brief paragraph description of the
		* program. What does it do?
		* This is program is sort of word search puzzle kind of game in a 2D array.
		* We used integers and sums instead of letters and words. We fins horizontal
		* and vertical sums in a 2D input array of integers that equal some input integer value.
		* We work with 2D input arrays of integers that have m rows and n column, where m>0 and n>0
		* and the input arrays contain only integers ranging from 1 to 9.
		* THe main purpose are to write  a method that convert a 2D array to a neatly printable String and to write two 
		* additional methods that find the horizontal and vertical sums for 2D input array and an input integer called sumToFind.
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

public class FindTheSums {



// This method will return a String that is a neat representation of the values in array a
// By neat, we mean that values in each column of  a have a single space between them and the 
// rows have a single new line character between them
// There should not be a space before the first value in a column or after the last value in a column
// Also, there should not be a newline before the first row or  after the last row

public static String arrayToString(int[][] a)
{
	String str = "";
	
	// for each row
	for(int i=0;i<a.length;i++)
	{
		// for each col
		for(int j=0;j<a[i].length;j++)
		{
			// join number
			str += a[i][j];
			
			// join a space
			if(j < a[i].length-1) str += " ";
		}
		
		// join a bew line
		if(i < a.length-1)str += "\n";
	}
	
	return str;
}


// This method will create a new output array called b that has the same dimensions as a 
// For each a[i][j], where i and j are valid indices in a,if a[i][j] is part of a horizontal sum 
// in a that equals sumToFind, then b[i][j]= a[i][j]; otherwise, b[i][j] = 0
// The method should return b
public static int[][] horizontalSums(int[][] a, int  sumToFind)
{
	int start = 0; // start of sum
	int end = 0; // end of sum
	int sum = 0; // accumulate sum
	
	// make array b
	int[][] b = new int[a.length][a[0].length];
	
	// for each row
	for(int i=0;i<a.length;i++)
	{
		// for each col
		for(int j=0;j<a[i].length;j++)
		{
			start = j; // staore start of sum
			end = j; // store end of sum
			sum =0; // accumulate sum
			
			// scan row line
			for(int k=j;k<a[i].length;k++)
			{
				sum += a[i][k]; // sum it
				
				// sum found
				if(sum == sumToFind)
				{
					end = k; // end of sum
					
					// copy from a to b
					for(int n=start;n<=end;n++)
					{
						b[i][n] = a[i][n];
					}
				}
			}
			
		}
		
	}
	
	return b; // return sum
}

// This method will create a new output array called b that has the same dimensions as a
// For each a [i][j], where i and j are valid indices in a, if a
// [i][j] is part of a vertical sum in a that equals sumToFind, then 
// b[i][j] = a[i][j]; otherwise, b[i][j] = 0
// The method should return b
public static int[][] verticalSums(int[][] a, int sumToFind)
{
	int start = 0; // start of sum
	int end = 0; // end of sum
	int sum = 0; // accumulate sum
	
	// make array b
	int[][] b = new int[a.length][a[0].length];
	
	// for each col
	for(int i=0;i<a[0].length;i++)
	{
		// for each row
		for(int j=0;j<a.length;j++)
		{
			start = j; // store start aum
			end = j; // store end of sum
			sum =0; // start sum
			
			// scan column for sum
			for(int k=j;k<a.length;k++)
			{
				sum += a[k][i]; // sum it
				
				// sum found
				if(sum == sumToFind)
				{
					end = k; // end of sum
					
					// copy from a to b
					for(int n=start;n<=end;n++)
					{
						b[n][i] = a[n][i];
					}
				}
			}
			
		}
		
	}
	
	return b; // return sums
    }
	
}
