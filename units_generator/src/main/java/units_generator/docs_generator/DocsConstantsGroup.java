package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.ConstantInterface;
import units_generator.internal.ConstantsGroupInterface;
import units_schema.Constant;
import units_schema.ConstantsGroup;

public class DocsConstantsGroup implements ConstantsGroupInterface {

	private String groupName;
	private List<ConstantInterface> constants;
	
	public DocsConstantsGroup(ConstantsGroup group) {
		groupName = group.getGroupName();
		constants = new ArrayList<>();
		for (Constant constant : group.getConstants()) 
			constants.add(new DocsConstant(constant));
	}
	
	@Override
	public String getGroupName() {
		return groupName;
	}

	@Override
	public List<ConstantInterface> getConstants() {
		return constants;
	}

}
