package coms362.cards.fiftytwo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import coms362.cards.abstractcomp.GameFactory;
import coms362.cards.abstractcomp.Player;
import coms362.cards.app.GameFactoryFactory;
import model.Button;
import model.Location;

/**
 * 
 * @author Zoe Sanders
 *
 */

public class PU52SPTest {
	private GameFactoryFactory gff;
	private GameFactory gf;

	@Before
	public void setup() {
		gff = new GameFactoryFactory();
		gf = gff.getGameFactory("PU52");
	}

	@Test
	public void test1() {
		String name = gf.getClass().getSimpleName();
		assertEquals(name, "P52SPGameFactory");
	}
	@Test 
	public void test2()
	{
		GameFactory gf = gff.getGameFactory("PU52");
		boolean x = gf.createTable().isMatchOver();
		assertEquals(x, false);
	}
	

}
