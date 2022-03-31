package coms362.cards.fiftytwo;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Rules;
import coms362.cards.abstractcomp.RulesDispatch;
import coms362.cards.abstractcomp.Table;
import events.inbound.InitGameEvent;
import events.inbound.SetQuorumEvent;
import model.Quorum;

public class PickupSPRules extends PickupRules implements Rules, RulesDispatch {
	
	
	@Override
	public Move apply(InitGameEvent e, Table table, Player player)
	{
		Player p1 = table.getPlayer((Integer) 1);
		return new PickupInitCmd(table.getPlayerMap());
	}
	@Override
	public Move apply(SetQuorumEvent e, Table table, Player player){
		return new SetQuorumCmd(new Quorum(1,1));
	}
	

}
