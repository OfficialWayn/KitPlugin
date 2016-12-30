package de.officialwayn.kits.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.officialwayn.kits.commands.kits_cmd;
import de.officialwayn.kits.kits.KitsUtil;

public class Main extends JavaPlugin {
	
	static String prefix = "§9Kits§7 | ";
	
	
	@Override
	public void onEnable() {
		KitsUtil.registerKits();
		getCommand("kits").setExecutor(new kits_cmd());
		System.out.println("Kits System gestartet!");
	}
	
	public static String getPrefix() {
		return prefix;
	}


}
