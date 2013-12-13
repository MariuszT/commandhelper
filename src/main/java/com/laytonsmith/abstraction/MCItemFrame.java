package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.enums.MCRotation;

public interface MCItemFrame extends MCHanging {

	public MCItemStack getItem();

	public void setItem(MCItemStack item);

	public MCRotation getRotation();

	public void setRotation(MCRotation rotation);
}
