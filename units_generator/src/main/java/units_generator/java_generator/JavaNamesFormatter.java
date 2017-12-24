package units_generator.java_generator;

import com.google.common.base.CaseFormat;

public class JavaNamesFormatter {

	static String toUpperCamelCase(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.UPPER_CAMEL,
				toLowerUnderscore(unitName));
	}
	
	static String toLowerCamelCase(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.LOWER_CAMEL,
				toLowerUnderscore(unitName));
	}
	
	static String toLowerUnderscore(String unitType) {
		return unitType.toLowerCase().replace(" ", "_");
	};
}
