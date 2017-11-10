/*
* Deck.java
* Author: Tonmoy M Iskander
* Submission Date: 07/27/2015 *
* Purpose: A brief paragraph description of the
* program. What does it do? How does it do it? 
The class Deck represents the deck of cards that the Dealer and Player’s Hands will come from.
A Deck class represented by instance variables  card[], that represents the cards stored in deck; and numberCardsInDeck, number of cards physically 
in the actual deck.
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without
* written consent from the Department of Computer Science. */




import java.util.Random;

/**
 * Class representing a standard 52 card deck. Allows users to shuffle, draw,
 * and add cards to the bottom for the purpose of playing various card games.
 */
public class Deck {
	
	/**
	 * Cards in the deck
	 */
	private Card [] cards;
	
	/**
	 * The number of cards in the physical deck on the table.
	 */
	private int numCardsInDeck;
	
	/**
	 * Create a standard 52 card deck w/ one of each type (Ace, King, Queen...) for each Suit (Hearts, Spades ..)
	 */
	public Deck() {
		
		Card.Suit [] suits = Card.Suit.values(); //creates an array of all of the Suits
		Card.Type [] types = Card.Type.values(); //creates an array of all of the Types
		cards = new Card[suits.length*types.length]; //sets the size of cards to 52 (types & suits)
		numCardsInDeck = 0;
		
		for(int i =0; i<suits.length; i++)
		{
			for(int j = 0; j<types.length; j++)
			{
				//Assigns 52 unique cards to the cards deck
				cards[numCardsInDeck] = new Card(types[j], suits[i]); 
				numCardsInDeck++; //increments the number of cards in the deck
			}
		}	
	}
	/**
	 * Draws card from the top
	 * @return the top card
	 */
	public Card draw() {
		
		
		if(numCardsInDeck==0)
		{
			System.out.println("Deck Empty");
			return null;
		}
		
		return cards[--numCardsInDeck];
	}

	/**
	 * Swaps card at a with card at b
	 * @param a card to be swapped with b
	 * @param b card to be swapped with a
	 */
	private void swap(int a, int b) {
		
		Card c = cards[a];
		cards[a] = cards[b];
		cards[b] = c;
		
	}
	
	/**
	 * Shifts all the cards in the deck right by one place
	 */
	private void shiftRightOne() {
	
		// deck full?
		if(numCardsInDeck==cards.length)
		{
			System.out.println("Deck full");
		}
		
		// shift right
		else
		{
			for(int i=cards.length-1;i>0;i--)
			{
				cards[i] = cards[i-1];
			}
			
		}
	}	
	
	/**
	 * Add c to the bottom of the deck
	 * Print "Deck Full" when count equals the size of the deck
	 * @param c card to add
	 */	
	public void addToBottom(Card c) {
		
		shiftRightOne();
		if(numCardsInDeck!=cards.length)
		{
			cards[0]=c;
			numCardsInDeck++;
		}
 	}

	/**
	 * Shuffles the deck by swapping the cards 100 times
	 */
	public void shuffle() {
		
		int n = 100;
		
		for(int i=0;i<n;i++)
		{
			int a = (int)(Math.random() * cards.length);
			int b = (int)(Math.random() * cards.length);
			swap(a,b);
		}
	}
	/**
	 * Shuffles the deck by swapping cards n times
	 * @param n number of swaps
	 */
	public void shuffle(int n) {
		
		for(int i=0;i<n;i++)
		{
			int a = (int)(Math.random() * cards.length);
			int b = (int)(Math.random() * cards.length);
			swap(a,b);
		}
		 
	}

}