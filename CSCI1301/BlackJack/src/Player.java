/*
* Player.java
* Author: Tonmoy M Iskander
* Submission Date: 07/27/2015 *
* Purpose: A brief paragraph description of the
* program. What does it do? How does it do it? 
The class Player class represents the human player in the Black Jack game.
We characterize the class by the following instance variables Player,Hand, busted,returnCardsToDeck, het Hand.
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
 * A player in a blackJack game
 *
 */
public class Player {
	/**
	 * The players hand
	 */
	private Hand hand;
	
	/**
	 * Instantiates the hand instance variable.
	 */
	public Player() {
		
		hand = new Hand();
	}
	
	/**
	 * @return true if the player has bused
	 */
	public boolean busted() {
	
		int valueHand = BlackJack.getValueOfHand(hand);
		if(valueHand > 21) return true;
		return false;
	}
	
	/**
	 * empty the player hand into the cards
	 * @param d deck that receives the cards
	 */
	public void returnCardstoDeck(Deck d) {
		
		for(Card c: hand.emptyHand())
			d.addToBottom(c);
	}
	/**
	 * 
	 * @return the player's hand
	 */
	public Hand getHand() {
		return hand;
	}
}