package coms362.cards;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import coms362.cards.abstractcomp.GameFactory;
import coms362.cards.abstractcomp.Player;
import coms362.cards.app.GameFactoryFactory;
import model.TableBase;

/**
 * 
 * @author Kamini Saldanha
 *
 */

public class TestTableBase {
    private GameFactoryFactory gff;
    private GameFactory gf;
    private TableBase table;

    /**
     * Sets up the initial single player game.
     */
    @Before
    public void setup() {
        gff = new GameFactoryFactory();
        gf = gff.getGameFactory("PU52");
        table = new TableBase(gf.createPlayerFactory());
    }

    /**
     * Checks if setting the match over does indeed make the match over even in a single
     * player game.
     */
    @Test
    public void test1() {
        table.setMatchOver(true);
        assertEquals(true, table.isMatchOver());
    }
}
