package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.ConstantInterface;
import units_generator.internal.ConstantsGroupInterface;
import units_schema.Constant;
import units_schema.ConstantsGroup;

public class JavaConstantsGroup implements ConstantsGroupInterface {

	private String groupName;
	private String className;
	private List<ConstantInterface> constants;
	private Set<String> imports;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaConstantsGroup(JavaUnitsSchema schema, ConstantsGroup group) {
		groupName = group.getGroupName();
		className = JavaNamesFormatter.toUpperCamelCase(groupName);
		imports = new TreeSet<>();
		constants = new ArrayList<>();
		for (Constant constant : group.getConstants()) {
			if (supportChecker.isSupported(constant)) {
				JavaConstant javaConstant = new JavaConstant(schema, constant); 
				constants.add(javaConstant);
				imports.addAll(javaConstant.getNeededImports());
			}
		} 
	}
	
	@Override
	public String getGroupName() {
		return groupName;
	}

	public String getClassName() {
		return className;
	}

	@Override
	public List<ConstantInterface> getConstants() {
		return constants;
	}

	public Set<String> getImports() {
		return imports;
	}

}
