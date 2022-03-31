package coms362.cards;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import coms362.cards.abstractcomp.GameFactory;
import coms362.cards.app.GameFactoryFactory;
import model.Button;
import model.Location;

/**
 * 
 * @author Kamini Saldanha
 *
 */

public class TestMove {
    private GameFactoryFactory gff;
    private GameFactory gf;

    @Before
    public void setup() {
        gff = new GameFactoryFactory();
        gf = gff.getGameFactory("PU52");
    }

    @Test
    public void test1() {
        gf.createTable();
        gf.createPlayer(1, "123");

    }

}