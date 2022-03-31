package coms362.cards;

import model.Card;
import model.Location;
import model.Pile;
import model.TableBase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.TestCase;

import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Table;
import coms362.cards.fiftytwo.P52GameFactory;
import coms362.cards.fiftytwo.PickupPlayer;

/**
 * @author nicg
 *
 */
public class TestPlayerScore extends TestCase
{
	@Test
	public void test() 
    { 
	    	Pile p = new Pile("Played cards", new Location(1,1)); 
	    	Card c = new Card(); 
	    	Player p1 = new PickupPlayer(1);
	    	c.setSuit("Hearts"); 
	    	c.setNumber(12); 
	    	p.addCard(c); 
	    	Table table = new TableBase(new P52GameFactory());
	    	table.addPile(p); 
	    	table.removeFromPile("Played cards", c); 
	    	table.addPlayer(p1);
	    	assertEquals(table.addToScore(p1, 12), 12);
    }
}
