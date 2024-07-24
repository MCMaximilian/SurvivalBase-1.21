package com.mcmaximilian.Event;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        Player joinPlayer = event.getPlayer();

        event.joinMessage( Component.text(joinPlayer.getName() + "이(가) 서버에 접속하였습니다!").color(NamedTextColor.YELLOW));
        //TODO: Join Msg

        joinPlayer.playSound( joinPlayer , Sound.ENTITY_PLAYER_LEVELUP , 1, 1);
    }
}
