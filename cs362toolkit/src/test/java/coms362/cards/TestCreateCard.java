package coms362.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import coms362.cards.abstractcomp.Player;
import model.Card;

/**
 * @author Cata
 *
 */
public class TestCreateCard {
	
	private Card c;

	@Before
	public void setup() {
		c = new Card();
		c.setNumber(10);
		c.setSuit("h");
		c.setFaceUp(true);
	}
	
	
	
	@Test
	public void getNumber() {
		assertEquals(10, c.getNumber());
	}
	
	@Test
	public void getSuit() {
		assertEquals("h", c.getSuit());
	}
	
	@Test
	public void isFaceUp() {
		assertEquals(true, c.isFaceUp());
	}
}
