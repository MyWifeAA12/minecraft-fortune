package com.MWAA12.fortune;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("Fortune enabled");
        this.getCommand("fortune").setExecutor(new fortunecommands());

    }

    @Override
    public void onDisable() {
        getLogger().info("Fortune disabled");
    }
}
