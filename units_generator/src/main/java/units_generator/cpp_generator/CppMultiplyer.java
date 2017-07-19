package units_generator.cpp_generator;

import units_schema.Multiplyer;

public class CppMultiplyer {
	
	private String name;
	private String className;
	
	public String getName() {
		return name;
	}
	
	public String getClassName() {
		return className;
	}

	public CppMultiplyer(Multiplyer multiplyer) {
		name = multiplyer.toString();
		className = CppNamesFormatter.formatClassname(name);
	}
}
