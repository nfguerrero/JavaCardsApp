

package coms362.cards;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

import org.junit.Test;

import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Rules;
import coms362.cards.abstractcomp.Table;
import coms362.cards.abstractcomp.View;
import coms362.cards.app.PlayController;
import coms362.cards.fiftytwo.LoggingView;
import coms362.cards.fiftytwo.P52GameFactory;
import coms362.cards.fiftytwo.PickupInitCmd;
import coms362.cards.fiftytwo.PickupPlayer;
import coms362.cards.fiftytwo.PickupRules;
import coms362.cards.streams.InBoundQueue;
import events.inbound.DealEvent;
import events.inbound.EndPlay;
import model.Card;
import model.Location;
import model.Pile;
import model.TableBase;

public class TestPile {

	@Test
	public void MakePile()
	{
		Pile p = new Pile("testPile", new Location(3,1));
		Card c = new Card();
    	c.setSuit("Spades");
    	c.setNumber(5);
    	p.addCard(c);
		assertEquals(p.getLocation().getX(), 3);
		//assertEquals(p.getCard("420"), "420");
		assertEquals(p.getName(), "testPile");
		assertEquals(c.getSuit(), "Spades");
		assertEquals(c.getNumber(), 5);
	}
	@Test
	public void AddPile()
	{
		Table table = new TableBase(new P52GameFactory());
		Pile p = new Pile("testPile", new Location(3,1));
    	table.addPile(p);
    	assertEquals(table.getPile("testPile").name, "testPile");
	}
}
