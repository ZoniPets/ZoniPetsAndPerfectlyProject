package me.perfectly.megawalls;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class KitAPI {
	
	public static HashMap<String, String> Kit = new HashMap<>();
	
	public static void setKit(Player p, String kit){
		Kit.put(p.getName(), kit);
	}
	
	public static String getKit(Player p){
		if(Kit.containsKey(p.getName())){
			return Kit.get(p.getName());
		}else{
			return "Nenhum";
		}
	}
	
	public static void RemoveKit(Player p){
		Kit.remove(p.getName());
		
	}
	
}