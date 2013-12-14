package com.laytonsmith.abstraction.enums.bukkit;

import com.laytonsmith.abstraction.Implementation;
import com.laytonsmith.abstraction.enums.EnumConvertor;
import com.laytonsmith.abstraction.enums.MCSkullType;
import com.laytonsmith.annotations.abstractionenum;
import org.bukkit.SkullType;

/**
 *
 * @author MariuszT
 */
@abstractionenum(
		implementation = Implementation.Type.BUKKIT,
		forAbstractEnum = MCSkullType.class,
		forConcreteEnum = SkullType.class
)
public class BukkitMCSkullType extends EnumConvertor<MCSkullType, SkullType> {

	private static com.laytonsmith.abstraction.enums.bukkit.BukkitMCSkullType instance;

	public static com.laytonsmith.abstraction.enums.bukkit.BukkitMCSkullType getConvertor() {
		if (instance == null) {
			instance = new com.laytonsmith.abstraction.enums.bukkit.BukkitMCSkullType();
		}
		return instance;
	}
}
