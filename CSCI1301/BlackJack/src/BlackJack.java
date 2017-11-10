
//import Card.Type;


/**
 * Class representing a single player blackjack game
 */
public class BlackJack {
	
	private Deck deck;
	private Dealer dealer;
	private Player player;


	/**
	 * Constructs and prepares for a new game of BlackJack.
	 * Creates player, dealer and deck objects then shuffles
	 * the deck and gives both the dealer and player two cards.
	 */
	public BlackJack() {
		
		player = new Player();
		dealer = new Dealer();
		deck = new Deck();
		deck.shuffle();
		
		// give 2 cards each
		player.getHand().addCard(deck.draw());
		dealer.getHand().addCard(deck.draw());
		player.getHand().addCard(deck.draw());
		dealer.getHand().addCard(deck.draw());
		
	}
	/**
	 * Restarts in a few steps
	 * 1. The Player and dealer return their cards to the deck.
	 * 2. The deck is shuffled.
	 * 3. Both the player and the dealer receive two cards drawn form the top of the deck.
	 */
	public void restart() {
		
		dealer.returnCardstoDeck(deck);
		player.returnCardstoDeck(deck);
		
	}
	/**
	 * Returns the value of a card in a standard game of Blackjack based on the type of the card
	 * ex. An Ace would return 1, a 2 would return 2... 
	 * @param c card whose value is extracted
	 * @return value of the card
	 */
	public static int getValueOfCard(Card c) {
		
		int value = 0;
		if(c == null) return 0;
		else
			{
			value = c.getType().ordinal()+1;
			if(value > 10) value = 10;
			}
		
		return value;
	}
	/**
	 * Returns the maximum value of the hand that does not result in a bust
	 * @param h Hand whose value is returned
	 * @return value of h
	 */
	public static int getValueOfHand(Hand h) {
		
        int value = 0; // hand value
        int aces = 0; // count aces
        
        Card[] cards = h.getCards();
        
        for(int i=0;i<cards.length;i++)
        {
           // sum value 
           value += getValueOfCard(cards[i]);
           
           // count aces
           if(cards[i].getType()==Card.Type.ACE) aces ++;
        }
        
        // apply aces
        for(int i=0;i<aces;i++)
        {
        	if(value <= (21-11))
        	{
        		value = value + 10;
        	}
        }
       
        return value;
	}

	/**
	 * @return Deck used to play
	 */
	public Deck getDeck() {
		return deck;
	}
	
	/**
	 * @return Dealer of the game
	 */
	public Dealer getDealer() {
		return dealer;
	}
	
	/**
	 * @return Player playing the blackjack game
	 */
	public Player getPlayer() {
		return player;
	}

}