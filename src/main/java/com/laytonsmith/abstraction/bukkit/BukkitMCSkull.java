package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.blocks.MCBlockFace;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Skull;

/**
 *
 * @author MariuszT
 */
public class BukkitMCSkull extends BukkitMCMaterialData
implements com.laytonsmith.abstraction.MCSkull {

	Skull s;

	public BukkitMCSkull(Skull skull) {
		super(skull);
		this.s = skull;
	}

	@Override
	public void setFacingDirection(MCBlockFace direction) {
		BlockFace dir = BlockFace.valueOf(direction.name());
		s.setFacingDirection(dir);
	}

	@Override
	public MCBlockFace getFacing() {
		String dir = s.getFacing().name();
		return MCBlockFace.valueOf(dir);
	}

	@Override
	public int getData() {
		return s.getData();
	}

	@Override
	public Object getHandle() {
		return s;
	}
}
