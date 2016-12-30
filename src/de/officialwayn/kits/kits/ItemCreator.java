package de.officialwayn.kits.kits;

import java.util.Arrays;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemCreator {
	
	public static ItemStack createItem(Material mat, int amount, String displayname) {
		  ItemStack item  = new ItemStack(mat, amount);
		  ItemMeta meta = item.getItemMeta();
		  meta.setDisplayName(displayname);
		  
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack createItem(Material mat, int amount, String displayname, Enchantment ench) {
		  ItemStack item  = new ItemStack(mat, amount);
		  ItemMeta meta = item.getItemMeta();
		  meta.setDisplayName(displayname);
		  meta.addEnchant(ench, 1, true);
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack createItem(Material mat, int amount, String displayname, Enchantment ench, Enchantment ench2) {
		  ItemStack item  = new ItemStack(mat, amount);
		  ItemMeta meta = item.getItemMeta();
		  meta.setDisplayName(displayname);
		  meta.addEnchant(ench, 1, true);
		  meta.addEnchant(ench2, 1, true);
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack createItem2(Material mat, int amount, String displayname, String[] lore) {
		  ItemStack item  = new ItemStack(mat, amount);
		  ItemMeta meta = item.getItemMeta();
		  meta.setDisplayName(displayname);
		  meta.setLore(Arrays.asList(lore));
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack createItem3(Material mat, int amount, String displayname, int itemtype) {
		  ItemStack item  = new ItemStack(mat, amount, (short)itemtype);
		  ItemMeta meta = item.getItemMeta();
		  meta.setDisplayName(displayname);
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack createHead(String displayname, String owner) {
		  ItemStack item  = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
		  SkullMeta meta = (SkullMeta) item.getItemMeta();
		  meta.setOwner(owner);
		  meta.setDisplayName(displayname);
		  item.setItemMeta(meta);
		  return item;
	 }
	
	public static ItemStack coloredArmor(Material m, Color color, String name)
	{
		ItemStack leatherArmor = new ItemStack(m);
		LeatherArmorMeta meta = (LeatherArmorMeta) leatherArmor.getItemMeta();
		meta.setColor(color);
		if ( name != null )
		{
			meta.setDisplayName(name);
		}
		leatherArmor.setItemMeta(meta);
		return leatherArmor;
	}
	
	public static ItemStack coloredArmor2(Material m, Color color, String name, String[] lore)
	{
		ItemStack leatherArmor = new ItemStack(m);
		LeatherArmorMeta meta = (LeatherArmorMeta) leatherArmor.getItemMeta();
		meta.setColor(color);
		meta.setLore(Arrays.asList(lore));
		if ( name != null )
		{
			meta.setDisplayName(name);
		}
		leatherArmor.setItemMeta(meta);
		return leatherArmor;
	}

	
	

}
