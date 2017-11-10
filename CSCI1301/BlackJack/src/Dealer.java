
/*
* Dealer.java
* Author: Tonmoy M Iskander
* Submission Date: 07/27/2015 *
* Purpose: A brief paragraph description of the
* program. What does it do? How does it do it? 
* The class Dealer represents the dealer in the Black Jack game. 
* He draws (hits) until he reaches 17 points or 5 cards.
* The class BlackJack represents the actual game of blackjack being played. 
* We will not be implementing a full simulation however, as that is done by BlackJackApp.
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
 * The Dealer in your game of BlackJack. Draws until he/she gets 17 points or has 5 cards.
 *
 */
public class Dealer {
	/**
	 * The dealers hand
	 */
	Hand hand;
	
	/**
	 * Construct a new dealer with an empty hand
	 */
	public Dealer() {
		
		hand = new Hand();
	}
	
	/**
	 * Dealer draws a card if his hand is worth less than 17 points 
	 * and has less than 5 cards in in his hand.
	 * 
	 * @param deck
	 * @return
	 */
	public Card playTurn(Deck deck) {
		
	
		int valueHand = BlackJack.getValueOfHand(hand);
		int valueCard = BlackJack.getValueOfHand(hand);
		
		// add card if hand value < 17
		if(hand.size()<5 && (valueHand + valueCard)< 17)
		{
			Card card = deck.draw();
			hand.addCard(card);
			return card;
		}
		
		else return null;
	}
	
	/**
	 * A method to check if the dealer has busted
	 * @return boolean true if the dealer has busted
	 */
	public boolean busted() {
		
		int valueHand = BlackJack.getValueOfHand(hand);
		if(valueHand > 21) return true;
		return false;
	}
	
	/**
	 * A method to check if the dealer will draw a card.
	 * @return
	 */
	public boolean isDone() {
		int valueHand = BlackJack.getValueOfHand(hand);
		if(hand.size() < 5 && valueHand < 17) return false;
		else return true;
	}
	
	/**
	 * Returns the dealers cards to the deck
	 * @param d Deck to return the cards to
	 */
	public void returnCardstoDeck(Deck d) {
		
		for(Card c: hand.emptyHand())
			d.addToBottom(c);
	}
	/**
	 * @return Hand the dealer's hand
	 */
	public Hand getHand() {
		return hand;
	}
}