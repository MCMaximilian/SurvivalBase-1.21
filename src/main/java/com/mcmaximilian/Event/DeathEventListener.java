package com.mcmaximilian.Event;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEventListener implements Listener {

    @EventHandler
    public void onDeathEvent(PlayerDeathEvent event) {
        Player deathPlayer = event.getPlayer();
        int xPos = (int) deathPlayer.getX();
        int yPos = (int) deathPlayer.getY();
        int zPos = (int) deathPlayer.getZ();
        Component DeathMsg = Component.text("플레이어 " + deathPlayer.getName() +"이(가) ").color(NamedTextColor.YELLOW).decoration(TextDecoration.BOLD , true);
        DeathMsg = DeathMsg.append( Component.text( deathPlayer.getWorld().key().key().toString() + "에 ").color(NamedTextColor.AQUA).decoration( TextDecoration.BOLD, true));
        DeathMsg = DeathMsg.append( Component.text("[ " + xPos + " , " + yPos + " , " + zPos + " ]").color(NamedTextColor.GREEN).decoration(TextDecoration.BOLD , true));
        DeathMsg = DeathMsg.append(Component.text(" 에서 사망하였습니다!").color(NamedTextColor.YELLOW).decoration(TextDecoration.BOLD , true));
        Bukkit.getServer().broadcast( DeathMsg );
    }
}
