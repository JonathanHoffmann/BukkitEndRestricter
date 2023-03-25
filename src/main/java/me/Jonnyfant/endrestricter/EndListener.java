package me.Jonnyfant.endrestricter;

import net.md_5.bungee.chat.SelectorComponentSerializer;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class EndListener implements Listener {
    @EventHandler
    public void onEnterEnd(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();

        if (player.getWorld().getEnvironment().equals(World.Environment.THE_END)) {
            if (player.hasPermission("endrestricter.enterend")) {
                player.sendMessage("You have permission to enter the End");
            } else {
                player.sendMessage("Player doesn't have permission");
                player.teleport(event.getFrom().getSpawnLocation());
            }
        }
    }
}