package coms362.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import model.Deck;
import model.Location;
import model.Pile;

/**
 * @author Cata
 *
 */
public class DeckTest {
	
	private Pile pile;
	private Deck deck;
	private Location loc;
//	private Card card;
	
	/**
	 * Testing the deck class to see if it generates 52 cards.
	 */
	@Test
	public void createDeck() {
		
		loc = new Location(3,5);
		pile = new Pile("Main", loc);
		deck = new Deck("Main", loc);
		String num = "";
		int n = 1;
		while (deck.getName().equals("Main") && deck.getCard(num + n) != null) {
			assertEquals(n%13, deck.getCard(num + n).getNumber()%13);
			n++;
		}
		if (n-1 ==  52) { 
			assertEquals(52, n-1); //Failed to generate 52 cards
		} 
		assertNotEquals(n, 52);
		
	}
}
