package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.MCItemFrame;
import com.laytonsmith.abstraction.MCItemStack;
import com.laytonsmith.abstraction.enums.MCRotation;
import com.laytonsmith.abstraction.enums.bukkit.BukkitMCRotation;
import org.bukkit.entity.ItemFrame;

/**
 *
 */
public class BukkitMCItemFrame extends BukkitMCHanging implements MCItemFrame {

	ItemFrame i;

	public BukkitMCItemFrame(ItemFrame item) {
		super(item);
		this.i = item;
	}

	public MCItemStack getItem() {
		return new BukkitMCItemStack(i.getItem());
	}

	public void setItem(MCItemStack item) {
		i.setItem(((BukkitMCItemStack) item).asItemStack());
	}

	public MCRotation getRotation() {
		return BukkitMCRotation.getConvertor().getAbstractedEnum(i.getRotation());
	}

	public void setRotation(MCRotation rotation) {
		i.setRotation(BukkitMCRotation.getConvertor().getConcreteEnum(rotation));
	}
}
