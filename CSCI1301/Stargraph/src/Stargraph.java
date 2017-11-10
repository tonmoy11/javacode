/*
* Stargraph.java
* Author: Tonmoy Mohammed Iskander
* Submission Date: 07/08/2015*
* Purpose: A brief paragraph description of the
* program. What does it do? 
* This is an extra practice of loops from the prior lab Life.java.In this lab we program to create a coordinate system and an astertisk graph.
* Using given formula and values updated.
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
 
 
public class Stargraph {
 
        public static void main(String[] args) {
               //decalaration of variables
        		int size =0;
                double incrementOfx;
                double x=0, y=0;
               
                Scanner keyboard = new Scanner(System.in);
               //portion where x  value is inputted by user and checked whether an integer greater than zero is inputted
                System.out.print("Please enter the number of x values to process: ");
                size = keyboard.nextInt();
                if (size <= 0)
                	{
                        System.out.println("The number of x must be an integer greater than 0.");
                        System.exit(0);
                	}
               
                System.out.print("Enter a minimum value for x: ");// minimum value for x
                x = keyboard.nextDouble();
               
               
                System.out.print("Enter the amount to increment x: ");//a value by which x is increased
                incrementOfx = keyboard.nextDouble();
                if (incrementOfx <= 0)
                	{
                        System.out.println("The increment must be a decimal number greater than 0.");
                        System.exit(0);
                	}
               
                double[] x_Value = new double[size];//declaring array for x
                double[] y_Value = new double[size];//declaring array for y
               
                System.out.println();
                System.out.println("Values");
                for (double index = 0; index < size ; index++)//the for loop prints the value till the value of size which is inputted by the user on top
                {
                        if (index == 0)
                        	{
                                y = 20.0 * Math.abs(Math.sin(x));//the formula from instruction page to calculate
                                System.out.print("x: ");
                                System.out.printf("%.3f", x_Value[(int) index]);
                                System.out.print(", y: ");
                                System.out.printf("%.3f", y_Value[(int) index]);
                                System.out.println();
                        	}
                       
                        else
                        	{
                                x = x + incrementOfx;
                                x_Value[(int) index] = x;
                                y = 20.0 * Math.abs(Math.sin(x));
                                y_Value[(int) index] = y;
                                System.out.print("x: ");
                                System.out.printf("%.3f", x_Value[(int) index]);
                                System.out.print(", y: ");
                                System.out.printf("%.3f", y_Value[(int) index]);
                                System.out.println();
                        	}
                }
               
               double[] graph = new double[(char) y];//the calculation part of graph.
               
                System.out.println("Graph");
                for (int index = 0; index< size; index++)
                	{
                        
                        System.out.print(":");
                        for(int i = 0; i<(int)y_Value[(int)index];i++ )
                        	System.out.print("*");
                        System.out.println();
                    
                
                	}
            }
}
 

