package units_generator.schema_validator;

import units_generator.schema_validator.exceptions.InvalidConstantDefinition;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Constant;
import units_schema.ConstantsGroup;
import units_schema.Schema;

public class ConstantValidator {
	
	public static void validate(
			Schema schema,
			ConstantsGroup group,
			Constant constant) throws InvalidSchema {
		validateName(group, constant);
		validateScaleDefinition(schema, group, constant);
	}

	private static void validateScaleDefinition(Schema schema, ConstantsGroup group, Constant constant)
			throws InvalidConstantDefinition, InvalidSchema {
		String context = getContext(group, constant);
		boolean isSimpleScale = constant.getUnitScale() != null;
		boolean isRatioScale = constant.getRatio() != null;
		if (isSimpleScale && isRatioScale)
			throw new InvalidConstantDefinition(context);
		if (isSimpleScale)
			UnitsExistanceValidator.validateUnitScaleExistanceCount(
					schema,
					constant.getUnitScale(),
					context);
		if (isRatioScale)
			RatioValidator.validateUnitScalesRatio(
					schema,
					constant.getRatio(),
					context);
	}

	private static void validateName(ConstantsGroup group, Constant constant) throws InvalidSchema {
		String context = getAnonymousContext(group, constant);
		NamesValidator.validateName(constant.getName(), context);
	}
	
	public static String getAnonymousContext(
			ConstantsGroup group,
			Constant constant) {
		int index = group.getConstants().indexOf(constant) + 1;
		return "in constant number " + index +
				" of \"" + group.getGroupName() + "\" constants group";
	}
	
	private static String getContext(ConstantsGroup group, Constant constant) {
		String context = "in \"" + constant.getName() + "\" of the \"" + group.getGroupName() + "\" constants group";
		return context;
	}
}
