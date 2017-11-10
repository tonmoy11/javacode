import java.util.Scanner;
public class MultipleChoiceFlashCard {
	

	/*
	* MultipleChoiceFlashCards.java
	* Author: Tonmoy Mohammed Iskander
	* Submission Date: [Submission date here] *
	* Purpose: A brief paragraph description of the
	* program. What does it do? *
	* The program generates random question from the .jar file. The user
	* is asked to enter answer, but any answer that begins with an integer
	* will termainate the program. THe program also scores according to the 
	* correctness of the answer.
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
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
//1st part___________________________________________________________________________		
		System.out.println(" Welcome to CSCI 1301 Multiple Choice Flash Cards!");
		System.out.println("");
		
		String questionAndChoices1 = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices(); 
		String choiceA1 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		String choiceB1 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		String choiceC1 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		String choiceD1 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD(); 
		String answer1 = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
	
		String answer;
		System.out.print(questionAndChoices1);
		
		System.out.println("Enter your answer(a-d):");
		//user input answer.
		answer= keyboard.nextLine();
		answer=answer.substring(0, 1);
		String choice="";
		//the invalid portion of the question
		if ((answer.equalsIgnoreCase("a")) || (answer.equalsIgnoreCase("b")||(answer.equalsIgnoreCase("C")) || (answer.equalsIgnoreCase("D"))))
		{
		}
		else
		{
			System.out.println("Invalid Answer\n");
			System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
		
		//answer part if-else
		 if	(answer1.equalsIgnoreCase(choiceA1))
		 {
			 choice= "A";
		 }
		 else if (answer1.equalsIgnoreCase(choiceB1))
		 {
			 choice="B";
		 }
		 else if (answer1.equalsIgnoreCase(choiceC1))
		 {
			 choice="C";
		 }
		 else if  (answer1.equalsIgnoreCase(choiceD1))
		 {
			 choice="D";
		 }
		//if-else part where it determines whether it is correct!
		 if(answer.equalsIgnoreCase(choice))
		 {
			 System.out.println("Correct answer");
		 }
		 else
		 {
			System.out.println("Incorrect Answer");
		 }
		 //scoring part
		
		int points;
			points=0;
		boolean score;
		//boolean score = answer.equalsIgnoreCase(choice);
		
		if ( score=answer.equalsIgnoreCase(choice))
		{
			points=points+1;
		}
		else
		{
			points=points+0;
		}
		
		
			System.out.println("your score:"+points+"out of 1 point(s)");
//2nd part--------------------------------------------------------------------------
		
			System.out.println("");
			
			
			String questionAndChoices2 = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices(); 
			String choiceA2 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
			String choiceB2 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
			String choiceC2 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
			String choiceD2 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD(); 
			String answer2 = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
			
			;
			System.out.print(questionAndChoices2);
			
			System.out.println("Enter your answer(a-d):");
			answer= keyboard.nextLine();
			answer=answer.substring(0, 1);

			//invalid part answer if-else part
			if ((answer.equalsIgnoreCase("a")) || (answer.equalsIgnoreCase("b")||(answer.equalsIgnoreCase("C")) || (answer.equalsIgnoreCase("D"))))
			{
			}
			else
			{
				System.out.println("Invalid Answer\n");
				System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
				System.out.println("Game Over!");
				System.exit(0);
			}
			
			//answer part if-else
			
			if	(answer2.equalsIgnoreCase(choiceA2))
			 {
				 choice= "A";
			 }
			 else if (answer2.equalsIgnoreCase(choiceB2))
			 {
				 choice="B";
			 }
			 else if (answer2.equalsIgnoreCase(choiceC2))
			 {
				 choice="C";
			 }
			 else if  (answer2.equalsIgnoreCase(choiceD2))
			 {
				 choice="D";
			 }
			 else
			 {
				 System.out.println("Incorrect Answer");
			 }
			 
			 if(answer.equalsIgnoreCase(choice))
					 {
				 System.out.println("Correct answer");
					 }
			 else{
				System.out.println("Incorrect answer"); 
			 }
			 
			
				//scoring part
				
				
				score=answer.equalsIgnoreCase(choice);
				if ( score=answer.equalsIgnoreCase(choice)) 
				{
					points=points+1;
				}
				else 
				{
					points=points+0;
				}
				
				
				
				
					System.out.println("Your score is:"+ points +"out of 2 point(s)");
//3rd part---------------------------------------------------------------------------------
				System.out.println("");
				String questionAndChoices3 = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices(); 
				String choiceA3 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
				String choiceB3 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
				String choiceC3 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
				String choiceD3 = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD(); 
				String answer3 = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
			
				System.out.print(questionAndChoices3);
				
				System.out.println("Enter your answer(a-d):");
				answer= keyboard.nextLine();
				answer=answer.substring(0, 1);

				//invalid answer if-else part
				if ((answer.equalsIgnoreCase("a")) || (answer.equalsIgnoreCase("b")||(answer.equalsIgnoreCase("C")) || (answer.equalsIgnoreCase("D"))))
				{
				}
				else
				{
					System.out.println("Invalid Answer\n");
					System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
					System.out.println("Game Over!");
					System.exit(0);
				}
				
				//answer part if-else
				 if	(answer3.equalsIgnoreCase(choiceA3))
				 {
					 choice= "A";
				 }
				 else if (answer3.equalsIgnoreCase(choiceB3))
				 {
					 choice="B";
				 }
				 else if (answer3.equalsIgnoreCase(choiceC3))
				 {
					 choice="C";
				 }
				 else if  (answer3.equalsIgnoreCase(choiceD3))
				 {
					 choice="D";
				 }
				 else
				 {
					 System.out.println("Incorrect Answer");
				 }
				 
				 if(choice.equalsIgnoreCase(answer))
						 {
					 System.out.print("Correct answer");
						 }
				 else
				 {
					System.out.println("Incorrect answer"); 
				 }
			//scoring part
					
					//score=answer.equalsIgnoreCase(choice);
					if ( score=answer.equalsIgnoreCase(choice))
					{
						points=points+1;
					}
					else
					{
						points=points+0;
					}
					System.out.println("Your score is:"+ points +"out of 3 point(s)");

			//final scoring portion
					int finalscore = 0;
					finalscore=points;
						System.out.println("");
						System.out.println("");
						
					System.out.println("Your final score:"+ finalscore);

					if (points==0 || points<=1)
					{
						System.out.println("Your computer science wit needs sharpening");
					}
					else if(points==2)
					{
					System.out.println("Your computer science wit is sharp.");					
					}
					else if(points==3)
					{
						System.out.println("Your computer science wit is as sharp as Occam's razor.");

					}
					System.out.println("Game Over!");
					}	

		 }