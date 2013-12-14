

package com.laytonsmith.abstraction.blocks;

import com.laytonsmith.abstraction.MCMaterialData;

/**
 *
 * @author layton
 */
public interface MCBlockState {

    public MCMaterialData getData();
    
    public int getTypeId();

	public boolean update();

	public boolean update(boolean force);

	public boolean update(boolean force, boolean applyPhysics);
    
}
