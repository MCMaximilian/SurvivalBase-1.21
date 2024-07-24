package com.mcmaximilian.Command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PositionCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if ( sender instanceof Player player && label.equalsIgnoreCase("pos") ) {

            int xPos = (int) player.getX();
            int yPos = (int) player.getY();
            int zPos = (int) player.getZ();

            Component text = Component.text("플레이어 " + player.getName() + "의 현재위치는 ").color(NamedTextColor.YELLOW).decoration(TextDecoration.BOLD, true);
            text = text.append( Component.text(player.getWorld().key().key() + "에 ").color(NamedTextColor.AQUA).decoration( TextDecoration.BOLD, true));
            text = text.append( Component.text( "[ " + xPos + " , " + yPos + " , " + zPos + " ] 있습니다!" ).color(NamedTextColor.GREEN).decoration( TextDecoration.BOLD, true));
            Bukkit.getServer().broadcast( text);
            return true;
        }
        return false;
    }
}
