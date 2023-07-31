package me.tj.aquarealmcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AquaRealmCommands extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getLogger().info("AquaRealmCommands loaded successfully.");

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("AquaRealmCommands unloaded successfully.");
    }
}
