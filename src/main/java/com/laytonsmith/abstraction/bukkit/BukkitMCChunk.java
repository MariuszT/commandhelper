
package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.MCChunk;
import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.abstraction.MCWorld;
import org.bukkit.Chunk;

/**
 *
 * @author import
 */
public class BukkitMCChunk implements MCChunk {
	Chunk c;

	public BukkitMCChunk(Chunk c) {
		this.c = c;
	}
	
	public int getX() {
		return c.getX();
	}

	public int getZ() {
		return c.getZ();
	}

	public MCEntity[] getEntities() {
		MCEntity[] ret = new MCEntity[c.getEntities().length];
		for (int i=0; i < c.getEntities().length; i++) {
			ret[i] = new BukkitMCEntity(c.getEntities()[i]);
		}
		return ret;
	}

	public MCWorld getWorld() {
		return new BukkitMCWorld(c.getWorld());
	}

	@Override
	public boolean isLoaded() {
		return c.isLoaded();
	}

	@Override
	public boolean load(boolean generate) {
		return c.load(generate);
	}

	@Override
	public boolean load() {
		return c.load();
	}

	@Override
	public boolean unload(boolean save, boolean safe) {
		return c.unload(save, safe);
	}

	@Override
	public boolean unload(boolean save) {
		return c.unload(save);
	}

	@Override
	public boolean unload() {
		return c.unload();
	}

	public Object getHandle() {
		return c;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof MCChunk ? this.c.equals(((BukkitMCChunk)o).c) : false;
	}

	@Override
	public int hashCode() {
		return c.hashCode();
}

	@Override
	public String toString() {
		return c.toString();
	}
}
