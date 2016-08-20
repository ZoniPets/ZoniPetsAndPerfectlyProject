package me.zoni.ac;

import me.zoni.ac.anticheat.AntiFly;
import me.zoni.ac.anticheat.AntiForceField;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	
	public static String prefix = "§6[§cZCheat§6] ";
	
	
	public void onEnable() {
		
		events();
		commands();
		
		Bukkit.getConsoleSender().sendMessage(prefix + "§aMade by ZoniPets!");
		
	}

	private void events() {
		
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(this, this);
		pm.registerEvents(new AntiFly(this), this);
		pm.registerEvents(new AntiForceField(this), this);

	}

	private void commands() {
		
	}

}
