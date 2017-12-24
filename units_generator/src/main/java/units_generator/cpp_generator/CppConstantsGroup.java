package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

import units_generator.internal.ConstantInterface;
import units_generator.internal.ConstantsGroupInterface;
import units_schema.Constant;
import units_schema.ConstantsGroup;

public class CppConstantsGroup implements ConstantsGroupInterface {

	private String groupName;
	private String lowerUnderscoreName;
	private String shoutyUnderscoreName;
	private List<ConstantInterface> constants;
	private Set<String> includes;
	
	public CppConstantsGroup(CppSchema schema, ConstantsGroup group) {
		groupName = group.getGroupName();
		lowerUnderscoreName = CppNamesFormatter.toLowerUnderscore(groupName);
		shoutyUnderscoreName = CppNamesFormatter.toShoutyUnderscore(groupName);
		constants = new ArrayList<>();
		includes = new TreeSet<>();
		for (Constant constant : group.getConstants()) {
			CppConstant cppConstant = new CppConstant(schema, constant); 
			constants.add(cppConstant);
			includes.addAll(cppConstant.getIncludeNeeded());
		}
	}
	@Override
	public String getGroupName() {
		return groupName;
	}

	@Override
	public List<ConstantInterface> getConstants() {
		return constants;
	}
	public String getLowerUnderscoreName() {
		return lowerUnderscoreName;
	}
	public String getShoutyUnderscoreName() {
		return shoutyUnderscoreName;
	}
	public Set<String> getIncludes() {
		return includes;
	}

}
