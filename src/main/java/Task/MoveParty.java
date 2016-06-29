package Task;

import PartyParticle.PartyParticle;
import cn.nukkit.Player;
import cn.nukkit.level.particle.BubbleParticle;
import cn.nukkit.math.Vector3;
import cn.nukkit.scheduler.PluginTask;

public class MoveParty extends PluginTask<PartyParticle> {
	private Player player;

	public MoveParty(PartyParticle plugin, Player player) {
		super(plugin);
		
		this.player = player;
	}

	@Override
	public void onRun(int currentTick) {
		Vector3 pos = player.getPosition().setComponents(player.x, player.y + 0.5, player.z);
		player.getLevel().addParticle(new BubbleParticle(pos));
		player.getLevel().addParticle(new BubbleParticle(pos));
		player.getLevel().addParticle(new BubbleParticle(pos));
		

	}
}