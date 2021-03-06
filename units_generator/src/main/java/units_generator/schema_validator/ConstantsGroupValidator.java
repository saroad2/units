package units_generator.schema_validator;

import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Constant;
import units_schema.ConstantsGroup;
import units_schema.Schema;

public class ConstantsGroupValidator {
	
	public static void validate(Schema schema, ConstantsGroup group) throws InvalidSchema {
		validateName(schema, group);
	}

	private static void validateName(Schema schema, ConstantsGroup group) throws InvalidSchema {
		String context = getAnonymousContext(schema, group);
		NamesValidator.validateName(group.getGroupName(), context);
		for (Constant constant : group.getConstants()) {
			ConstantValidator.validate(schema, group, constant);
		}
	}
	
	public static String getAnonymousContext(Schema schema, ConstantsGroup group) {
		int index = schema.getConstants().getConstantsGroups().indexOf(group) + 1;
		return "in context group number " + index;
	}
}
