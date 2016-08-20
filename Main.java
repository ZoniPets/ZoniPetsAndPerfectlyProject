package me.zoni.mw;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	public static Main getInstance() {
		
		return instance;
		
	}
	
	
	public void onEnable() {
		
		events();
		
	}

	private void events() {

		PluginManager pm = Bukkit.getServer().getPluginManager();
		
	}

}
