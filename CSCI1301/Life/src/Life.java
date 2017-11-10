/*
* Life.java
* Author: Tonmoy Mohammed Iskander
* Submission Date: 07/08/2015*
* Purpose: A brief paragraph description of the
* program. What does it do? 
* This is a representation of Conway's gameof life. It is a two dimensional grid of cell
* that evolves over generations. In a given generation, each cell may be alive or dead.
* This is determined by both its current states of the cells adjacent to it.
* The program approaches to identify its neighbor near each celland printing them on a grid.
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

import java.util.Random;
public class Life {

	
	public static void main(String[] args) {

		//These are the declaration of variables required for the grid setup.
		int gridSize=200;
		int cellSize=3;
		Grid grid  = new Grid (gridSize,cellSize,"The Game of Life");
		grid.setDelay(10);/*set delay helps to view the forwardness of the grid dispaly. The lesser
								the grid value the faster it displays on graphics. In this case we set it at 10.	*/

		int row=10;
		int col=25;
		int aliveColor=1;//we assigned 1 as alive color which is white on display
		int deadColor=0;//we assign 0 as black color which is black on display.

		//this part is the straight horizontal white line on display.
		for(row=10;row<11;row++)
		{
			for(col=25;col<75;col++)
			{
				grid.setPos(row,col,aliveColor);
				grid.update();

			}
		}

		grid.clearGrid();// this line helps to stop the white line from displaying
		Random r = new Random();// generate random rows and columns values with in the for loop

		for(row=0;row<200;row++)
		{
			for(col=0;col<200;col++)

			{			
				if( r.nextInt(100) > 49 ) 
					grid.setPos(row, col, aliveColor); 
				else 
					grid.setPos(row, col, deadColor);

			}
		}
		grid.initialize();
		grid.update();
//from here the actual game starts where we program the conditions applied for alive and dead cells
		while(true){
			for (int x = 0; x < 200; x++) 
			{
				for (int y = 0; y < 200; y++) 
				{
					int color=grid.getPos(x,y);
					int noOfAlive = grid.matchingNeighbors(x,y,aliveColor); //this part defining the matching neighbors that applies to the cell surrounded by the alive cell.
					if(color==aliveColor  && (noOfAlive==2 || noOfAlive==3))//for alive cell 
					{
						grid.setPos(x, y, aliveColor);
					}else if(color==aliveColor)
					{
						grid.setPos(x, y, deadColor);
					}
					if(color==deadColor && noOfAlive==3)//for deadcell
					{
						grid.setPos(x,y,aliveColor);
					}else if(color==deadColor){
						grid.setPos(x,y,deadColor);
					}	
				}		
			}
			grid.update();
		}
	}
}