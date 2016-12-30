package de.officialwayn.kits.kits;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

public class Kits {
	
	private String displayname;
	private String[] lore;
	private ArrayList<ItemStack> items;
	private String permissions;
	private String name;
	
	public Kits(String displayname, String[] lore, ArrayList<ItemStack> items, String permissions, String name) {
		this.displayname = displayname;
		this.lore = lore;
		this.items = items;
		this.permissions = permissions;
		this.name = name;
	}

	public String getDisplayname() {
		return displayname;
	}

	public String getPermissions() {
		return permissions;
	}

	public String getName() {
		return name;
	}

	public String[] getLore() {
		return lore;
	}

	public ArrayList<ItemStack> getItems() {
		return items;
	}

}
