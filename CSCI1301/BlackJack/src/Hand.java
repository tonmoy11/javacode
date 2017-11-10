/*
* Hand.java
* Author: Tonmoy M Iskander
* Submission Date: 07/27/2015 *
* Purpose: A brief paragraph description of the
* program. What does it do? How does it do it? 
The class Hand represents the cards in a player or dealers hands during a game of 
Black Jack or potentially other card games. 
Remember – when we design classes such as Card or Hand,
 we design them in a general way so that we could reuse this code later when we create a different game.
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



/**
 * 
 * @author ghyzel
 *
 */
public class Hand {
	
	/**
	 * The cards in the hand
	 */
	private Card [] cards;
	
	/**
	 * Creates an empty hand
	 */
	public Hand() {
		//Initializing an empty array. 
		//Calling cards.length on this array would return 0
		cards = new Card[0];		
	}

	/**
	 * Adds Card c to the hand
	 * 
	 * @param c card to be added
	 */
	public void addCard(Card c) {
		
		// make room for new card
		Card[] temp = new Card[cards.length + 1];
		
		// copy cards
		int i = 0;
		for(i=0;i<cards.length;i++)
			temp[i] = cards[i];
		temp[i] = c;
		
		// assign to cards
		cards = temp;
	}
	
	/**
	 * @return number of cards in the hand
	 */
	public int size() {
		return cards.length;
	}
	
	/**
	 * Returns an array of all the cards in the hand
	 * 
	 * @return the cards in the hand
	 */
	public Card[] getCards() {
		// Ensure you return reference to the copy of the cards array
		// and not a reference actual cards array!
		
		// make cards array
		Card[] copy = new Card[cards.length];
		
		// copy cards
		int i = 0;
		for(i=0;i<cards.length;i++)
			copy[i] = cards[i];
		
		// return copy
		return copy;
	}
	
	/**
	 * Empties the hand, and returns an array containing the discarded cards.
	 * 
	 * @return the discarded cards
	 */
	public Card[] emptyHand() {
		

		// make cards array
		Card[] copy = new Card[cards.length];
				
		// copy cards
		int i = 0;
		for(i=0;i<cards.length;i++)
			copy[i] = cards[i];
		
		// empty cards
		cards = new Card[0];		
				
		// return copy
		return copy;
	}
	
	/**
	 * Returns a String representation of the hand
	 * 
	 * E.g.
	 * 
	 * "Empty Hand"
	 * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
	 * 
	 * @return a String representing the hand
	 */
	@Override
	public String toString() {
	
       String str = "Empty Hand";
       
       for(int i=0;i<cards.length;i++)
       {
    	   if(i==0) str = "";
    	   str += cards[i].toString() + "\n";
       }
       
       return str;
       
       }
}