package com.laytonsmith.abstraction.blocks;

import com.laytonsmith.abstraction.enums.MCSkullType;

/**
 *
 * @author MariuszT
 */
public interface MCSkull extends MCBlockState {

	public boolean hasOwner();

	public String getOwner();

	public boolean setOwner(String name);

	public MCBlockFace getRotation();

	public void setRotation(MCBlockFace rotation);

	public MCSkullType getSkullType();

	public void setSkullType(MCSkullType skullType);

}
