package PartyParticle;

import Task.MoveParty;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.player.PlayerMoveEvent;
public class PartyParticle extends PluginBase implements Listener {

	@Override
	public void onEnable(){
		this.getLogger().info("파티☆파티클★플러그인이 활성화 되었습니다");
		this.getServer().getPluginManager().registerEvents(this, this);
		
	}

	
	@EventHandler
	public void PlayerMoveEvent(PlayerMoveEvent event){
	
		for (int i = 0; i < 12; i += 3) {
			this.getServer().getScheduler().scheduleDelayedTask(new MoveParty(this, event.getPlayer()), i);
		}
		
	}
}
