package de.officialwayn.kits.kits;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitsUtil {
	
	public static ArrayList<Kits> kits = new ArrayList<>();
	
	public static void registerKits() {
		//Standart
		String[] standart = {"§7Das ist das Standart Kit"};
		ArrayList<ItemStack> stand = new ArrayList<>();
		stand.add(new ItemStack(Material.IRON_SWORD));
		stand.add(new ItemStack(Material.IRON_HELMET));
		stand.add(new ItemStack(Material.IRON_CHESTPLATE));
		stand.add(new ItemStack(Material.IRON_LEGGINGS));
		stand.add(new ItemStack(Material.IRON_BOOTS));
		stand.add(new ItemStack(Material.GOLDEN_APPLE, 16));
		stand.add(new ItemStack(Material.ENDER_PEARL, 16));
		stand.add(new ItemStack(Material.ARROW, 64));
		kits.add(new Kits("Standart", standart, stand, null, "§7Standart"));
		
		//VIP
		String[] vip = {"§7Das ist das §eVIP §7Kit"};
		ArrayList<ItemStack> vv = new ArrayList<>();
		ItemStack bow = new ItemStack(Material.BOW);
		ItemMeta meta = bow.getItemMeta();
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow.setItemMeta(meta);
		vv.add(bow);
		vv.add(new ItemStack(Material.DIAMOND_SWORD));
		vv.add(new ItemStack(Material.DIAMOND_HELMET));
		vv.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
		vv.add(new ItemStack(Material.DIAMOND_LEGGINGS));
		vv.add(new ItemStack(Material.DIAMOND_BOOTS));
		
		
		vv.add(new ItemStack(Material.GOLDEN_APPLE, 16));
		vv.add(new ItemStack(Material.ENDER_PEARL, 16));
		vv.add(new ItemStack(Material.ARROW, 1));
		kits.add(new Kits("VIP", vip, vv, "kit.vip", "§eVIP"));
		
		//YT
		String[] yt = {"Das ist das §5YT §7Kit"};
		ArrayList<ItemStack> yy = new ArrayList<>();
		yy.add(ItemCreator.createItem(Material.DIAMOND_SWORD, 1, null, Enchantment.DAMAGE_ALL));
		yy.add(ItemCreator.createItem(Material.BOW, 1, null, Enchantment.ARROW_INFINITE, Enchantment.ARROW_KNOCKBACK));
		yy.add(ItemCreator.createItem(Material.DIAMOND_HELMET, 1, null, Enchantment.PROTECTION_ENVIRONMENTAL));
		yy.add(ItemCreator.createItem(Material.DIAMOND_CHESTPLATE, 1, null, Enchantment.PROTECTION_ENVIRONMENTAL));
		yy.add(ItemCreator.createItem(Material.DIAMOND_LEGGINGS, 1, null, Enchantment.PROTECTION_ENVIRONMENTAL));
		yy.add(ItemCreator.createItem(Material.DIAMOND_BOOTS, 1, null, Enchantment.PROTECTION_ENVIRONMENTAL));
		yy.add(new ItemStack(Material.GOLDEN_APPLE, 16, (byte) 1));
		yy.add(new ItemStack(Material.ENDER_PEARL, 32));
		yy.add(new ItemStack(Material.ARROW, 1));
		kits.add(new Kits("YT", yt, yy, "kit.yt", "§5YT"));
	}
	
	
	public static ArrayList<ItemStack> getKitItems(String name) {
		for(Kits kk : kits) {
			if(kk.getDisplayname().equalsIgnoreCase(name)) {
				return kk.getItems();
				
			}
		}
		return null;
		
	}
	
	public static String getKitPermissions(String name) {
		for(Kits kk : kits) {
			if(kk.getDisplayname().equalsIgnoreCase(name)) {
				return kk.getPermissions();
			}
		}
		return null;
		
		
	}
}
