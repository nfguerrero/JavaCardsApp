/*
/ * @author<Xingting Lai>
 */

package coms362.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Rules;
import coms362.cards.abstractcomp.Table;
import coms362.cards.app.PlayController;
import coms362.cards.app.ViewFacade;
import coms362.cards.fiftytwo.P52GameFactory;
import coms362.cards.fiftytwo.PickupMove;
import coms362.cards.fiftytwo.PickupPlayer;
import coms362.cards.fiftytwo.PickupRules;
import coms362.cards.streams.InBoundQueue;
import events.inbound.DealEvent;
import events.inbound.EndPlay;
import model.Card;
import model.TableBase;

public class TestPickUpCard {
	
	@Test	
	public void test() {
		InBoundQueue inQ = new InBoundQueue();
		inQ.add(new DealEvent());
		inQ.add(new EndPlay());
		
		ViewFacade views = new ViewFacade(null);

		Player player = new PickupPlayer(1);
		
		Card c = new Card();
		
		// initialize the local model for Pu52 match
		Table table = new TableBase(new P52GameFactory());
		Move move = new PickupMove(c, player);
		move.apply(table);
		Rules rules = new PickupRules();
		
		PlayController mainloop = new PlayController(inQ, rules);
		mainloop.play(table, player, views);
		
//		assertEquals(c, table.getPile("Tidy").getCard("2"));
	}
}
