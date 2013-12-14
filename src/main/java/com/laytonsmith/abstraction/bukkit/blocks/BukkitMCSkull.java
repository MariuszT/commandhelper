package com.laytonsmith.abstraction.bukkit.blocks;

import com.laytonsmith.abstraction.MCMaterialData;
import com.laytonsmith.abstraction.blocks.MCBlockFace;
import com.laytonsmith.abstraction.bukkit.BukkitMCMaterialData;
import com.laytonsmith.abstraction.enums.MCSkullType;
import org.bukkit.SkullType;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Skull;

/**
 *
 * @author MariuszT
 */
public class BukkitMCSkull extends BukkitMCBlockState implements
		com.laytonsmith.abstraction.blocks.MCSkull {

	Skull s;

	public BukkitMCSkull(Skull skull) {
		super(skull);
		this.s = skull;
	}

	@Override
	public boolean hasOwner() {
		return s.hasOwner();
	}

	@Override
	public String getOwner() {
		return s.getOwner();
	}

	@Override
	public boolean setOwner(String name) {
		return s.setOwner(name);
	}

	@Override
	public MCBlockFace getRotation() {
		return MCBlockFace.valueOf(s.getRotation().name());
	}

	@Override
	public void setRotation(MCBlockFace rotation) {
		s.setRotation(BlockFace.valueOf(rotation.name()));
	}

	@Override
	public MCSkullType getSkullType() {
		return MCSkullType.valueOf(s.getSkullType().name());
	}

	@Override
	public void setSkullType(MCSkullType skullType) {
		s.setSkullType(SkullType.valueOf(s.getSkullType().name()));
	}

	@Override
	public MCMaterialData getData() {
		return new BukkitMCMaterialData(s.getData());
	}

	@Override
	public int getTypeId() {
		return s.getTypeId();
	}

}
