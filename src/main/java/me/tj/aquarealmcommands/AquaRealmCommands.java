package me.tj.aquarealmcommands;

import me.tj.aquarealmcommands.commands.gmc;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AquaRealmCommands extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getLogger().info("AquaRealmCommands loaded successfully.");


        getCommand("gmc").setExecutor(new gmc());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("AquaRealmCommands unloaded successfully.");
    }
}
