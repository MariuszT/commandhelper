
package com.laytonsmith.abstraction;

/**
 *
 * @author import
 */
public interface MCChunk extends AbstractionObject {
	public int getX();
	public int getZ();
	public MCWorld getWorld();
	public MCEntity[] getEntities();
	public boolean isLoaded();
	public boolean load(boolean generate);
	public boolean load();
	public boolean unload(boolean save, boolean safe);
	public boolean unload(boolean save);
	public boolean unload();
}
