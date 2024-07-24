package com.mcmaximilian;

import com.mcmaximilian.Event.DeathEventListener;
import com.mcmaximilian.Event.JoinEventListener;
import com.mcmaximilian.Command.PositionCommand;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalBase extends JavaPlugin {

    @SuppressWarnings("DataFlowIssue")
    @Override
    public void onEnable() {

        ConsoleCommandSender consoleCommandSender = Bukkit.getServer().getConsoleSender();
        consoleCommandSender.sendMessage(Component.text("SurvivalBase Plugin has been enabled!").color(NamedTextColor.AQUA));

        getServer().getPluginManager().registerEvents( new DeathEventListener() , this);
        getServer().getPluginManager().registerEvents( new JoinEventListener() , this );

        getCommand("pos").setExecutor( new PositionCommand() );

    }

    @Override
    public void onDisable() {
        ConsoleCommandSender consoleCommandSender = Bukkit.getServer().getConsoleSender();
        consoleCommandSender.sendMessage( Component.text("SurvivalBase Plugin has been disabled!").color(NamedTextColor.RED));
    }
}
