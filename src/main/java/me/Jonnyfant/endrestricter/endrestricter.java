package me.Jonnyfant.endrestricter;

import org.bukkit.plugin.java.JavaPlugin;

public class endrestricter extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EndListener(), this);
    }
}
