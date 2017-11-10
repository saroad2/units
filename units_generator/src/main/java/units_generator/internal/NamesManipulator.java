package units_generator.internal;

import units_schema.UnitType;
import units_schema.UnitScale;

import java.util.regex.Pattern;

public class NamesManipulator {

	private static final Pattern namePattern =
		Pattern.compile("[a-z][a-z ]*[a-z]"); 

	public static String normalize(String name) {
		if(name == null)
			return null;
		return name.trim().toLowerCase().replace("_", " ");
	}
	
	public static String getName(UnitType unitType) {
		if (!isValidPrintName(unitType.getTypeName()))
			return null;
		return normalize(unitType.getTypeName());
	}
	
	public static String getName(UnitScale scale) {
		if (isValidName(scale.getName()))
			return normalize(scale.getName());
		if (isValidName(scale.getPluralName()))
			return normalize(scale.getPluralName());
		return null;
	}
	
	public static boolean isValidPrintName(String name) {
		return name != null && !name.isEmpty();
	}
	
	public static boolean isValidName(String name) {
		return isValidPrintName(name) && namePattern.matcher(name).matches();
	}
}
