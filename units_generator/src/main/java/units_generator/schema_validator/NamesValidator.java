package units_generator.schema_validator;

import java.util.regex.Pattern;

import units_generator.schema_validator.exceptions.EmptyName;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_generator.schema_validator.exceptions.InvalidName;

public class NamesValidator {
	
	private static final Pattern namePattern =
			Pattern.compile("[a-z][a-z0-9 ]*[a-z0-9]"); 

	/*Validation Functions*/
	public static void validateName(String name, String context) throws InvalidSchema{
		if (!isValidName(name))
			throw new InvalidName(name, context);
	}
	
	public static void validatePrintedName(String name, String context) throws InvalidSchema{
		if (!isValidPrintName(name))
			throw new EmptyName(context);
	}
	
	/*Check Functions*/
	public static boolean isValidPrintName(String name) {
		return name != null && !name.isEmpty();
	}
	
	public static boolean isValidName(String name) {
		return isValidPrintName(name) && namePattern.matcher(name).matches();
	}
}
