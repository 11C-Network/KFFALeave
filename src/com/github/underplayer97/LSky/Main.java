package com.github.underplayer97.LSky;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		
		saveConfig();
		
		this.saveDefaultConfig();
	}
	
}
