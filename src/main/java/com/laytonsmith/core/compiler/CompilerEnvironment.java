package com.laytonsmith.core.compiler;

import com.laytonsmith.core.constructs.CString;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Env;
import java.util.HashMap;
import java.util.Map;

/**
 * The compiler environment provides compilation settings, or other controller
 * specific values. This allows for separation of the compiler from the general layout
 * of configuration and other files. The compiler environment is available to the runtime
 * environment as well, but contains values that the compiler (or function optimizations)
 * might need, and are usually considered "static". The settings are all passed in to the constructor,
 * but you can use the various factory methods to create an environment from other sources.
 * @author lsmith
 */
public class CompilerEnvironment implements Env.EnvImpl{	
	Map<String, Construct> constants = new HashMap<String, Construct>();
	public void setConstant(String name, Construct value){
		constants.put(name, value);
	}
	public void setConstant(String name, String value){
		setConstant(name, new CString(value, Target.UNKNOWN));
	}
	public Construct getConstant(String name){		
		return constants.get(name);
	}
}
