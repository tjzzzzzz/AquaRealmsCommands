package me.tj.aquarealmcommands;

import me.tj.aquarealmcommands.commands.gmc;
import me.tj.aquarealmcommands.commands.gms;
import me.tj.aquarealmcommands.commands.gmsp;
import me.tj.aquarealmcommands.commands.msg.DataManager;
import me.tj.aquarealmcommands.commands.msg.MessageCommand;
import me.tj.aquarealmcommands.commands.msg.ReplyCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public final class AquaRealmCommands extends JavaPlugin {

    private DataManager dataManager;

    @Override
    public void onEnable() {

        Bukkit.getLogger().info("AquaRealmCommands loaded successfully.");


        dataManager = new DataManager();


        // Registering commands.
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("msg").setExecutor(new MessageCommand(dataManager));
        getCommand("r").setExecutor(new ReplyCommand(dataManager));
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("AquaRealmCommands unloaded successfully.");
    }
}
