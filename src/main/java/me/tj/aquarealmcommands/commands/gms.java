package me.tj.aquarealmcommands.commands;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gms implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player) {


            // casting player to sender.
            Player player = (Player) sender;

            // check if a player has a permission node.
            if (player.hasPermission("idk")) {


                if (args.length == 0) {

                    if (player.getGameMode().equals(GameMode.SURVIVAL)) {

                        player.sendMessage(MiniMessage.miniMessage().deserialize("<bold><Aqua>Aqua<white>Realm</bold> You're already in survival mode."));
                    } else {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(MiniMessage.miniMessage().deserialize("<bold><Aqua>Aqua<white>Realm</bold> Gamemode set to survival"));

                    }


                } else {


                    // Get
                    String targetName = args[0];


                    Player target = Bukkit.getServer().getPlayerExact(targetName);


                    // Check if the target player is null
                    if (target == null) {
                        player.sendMessage(MiniMessage.miniMessage().deserialize("<bold><Aqua>Aqua<white>Realm</bold> Player " + targetName + " not found."));
                        return true;
                    }


                    String targetname = target.getPlayer().getName();

                    if (target.getGameMode().equals(GameMode.SURVIVAL)) {

                        player.sendMessage(MiniMessage.miniMessage().deserialize("<bold><Aqua>Aqua<white>Realm</bold> " + targetname + " is already in survival mode."));
                    } else {
                        player.sendMessage(MiniMessage.miniMessage().deserialize("<bold><Aqua>Aqua<white>Realm</bold> Gamemode survival set for " + targetname));

                        target.setGameMode(GameMode.SURVIVAL);
                    }


                }

            }


        }


        return true;
    }

}