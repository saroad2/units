package units_generator.internal;

import units_schema.UnitType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import units_schema.UnitScale;

public class NamesManipulator {
	public static String normalize(String name) {
		if(name == null)
			return null;
		return name.trim().toLowerCase().replace("_", " ");
	}
	
	public static String getName(UnitType unitType) {
		if (!isValidString(unitType.getTypeName()))
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
	
	public static boolean isValidString(String s) {
		return s != null && !s.isEmpty();
	}
	
	public static boolean isValidName(String s) {
		if (s == null)
			return false;
		Pattern namePattern = Pattern.compile("^[ A-Za-z]+$");
		Matcher matcher = namePattern.matcher(s);
		return matcher.matches();
	}
}
