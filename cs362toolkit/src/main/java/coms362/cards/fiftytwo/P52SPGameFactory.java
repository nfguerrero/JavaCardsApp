package coms362.cards.fiftytwo;

import coms362.cards.abstractcomp.GameFactory;
import coms362.cards.abstractcomp.Rules;
import coms362.cards.abstractcomp.ViewFactory;
import model.PlayerFactory;

public class P52SPGameFactory extends P52GameFactory implements GameFactory, PlayerFactory, ViewFactory{
	@Override
	public Rules createRules() {
		return new PickupSPRules();
	}

}
