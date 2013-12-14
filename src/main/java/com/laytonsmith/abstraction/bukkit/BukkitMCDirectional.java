package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.MCDirectional;
import com.laytonsmith.abstraction.blocks.MCBlockFace;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;

/**
 *
 * @author MariuszT
 */
public class BukkitMCDirectional implements MCDirectional {

	Directional d;

	public BukkitMCDirectional(Directional d) {
		this.d = d;
	}

	@Override
	public void setFacingDirection(MCBlockFace face) {
		BlockFace dir = BlockFace.valueOf(face.name());
		d.setFacingDirection(dir);
	}

	@Override
	public MCBlockFace getFacing() {
		String dir = d.getFacing().name();
		return MCBlockFace.valueOf(dir);
	}
}
