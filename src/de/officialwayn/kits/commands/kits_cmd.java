package de.officialwayn.kits.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import de.officialwayn.kits.kits.Kits;
import de.officialwayn.kits.kits.KitsUtil;
import de.officialwayn.kits.main.Main;

public class kits_cmd implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	 	if(sender instanceof Player) {
			Player p = (Player)sender;
			if(args.length == 0 ) {
				String allkits = "§7";
				for(Kits kits : KitsUtil.kits) {
					allkits = allkits + kits.getDisplayname()+"§7, ";
				}
				
				p.sendMessage(Main.getPrefix()+"§7Verwendung: §e/kits "+allkits+"");
				
			} else if(args.length == 1) {
				ArrayList<ItemStack> items = KitsUtil.getKitItems(args[0]);
				if(items != null) {
					if(KitsUtil.getKitPermissions(args[0]) == null) { 
					for(int i = 0; i < items.size(); i++) {
						p.getInventory().addItem(items.get(i));
						
					}
					
					} else {
						if(p.hasPermission(KitsUtil.getKitPermissions(args[0]))) {
							for(int i = 0; i < items.size(); i++) {
								p.getInventory().addItem(items.get(i));
								
							}
							
						} else {
							p.sendMessage(Main.getPrefix()+"§cDu hast nicht genügend Rechte für das Kit §e"+args[0]);
						}
					}
					
				} else {
					p.sendMessage(Main.getPrefix()+"§7Das Kit §a"+args[0]+" §7existiert nicht!");
				}
				
				
			}
	 	
			
			
		}
		
		
		return true;
	}
	
	

}
