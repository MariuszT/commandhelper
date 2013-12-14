package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.blocks.MCBlockFace;

/**
 *
 * @author MariuszT
 */
public interface MCDirectional {

	public void setFacingDirection(MCBlockFace face);

	public MCBlockFace getFacing();
}
