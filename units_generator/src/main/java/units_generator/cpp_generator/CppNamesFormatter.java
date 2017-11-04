package units_generator.cpp_generator;

import com.google.common.base.CaseFormat;

public class CppNamesFormatter {

	static String formatClassName(String name) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.UPPER_CAMEL,
				toLowerUnderscore(name));
	}
	
	static String formatUnitTypeTagHeaderName(String name) {
		return toLowerUnderscore(name) + "_tags.h";
	}
	
	static String formatUnitTypeHeaderName(String name) {
		return toLowerUnderscore(name) + "_units.h";
	}
	
	static String formatNamespaceName(String name) {
		return toLowerUnderscore(name);
	}
	
	static String formatTagName(String name) {
		return toLowerUnderscore(name + " tag");
	}
	
	static String formatCodeName(String name) {
		return toLowerUnderscore(name) + "_code";
	}
	
	static String toLowerUnderscore(String name) {
		return name.toLowerCase().replace(" ", "_");
	}

	static String toLowerCamelCase(String name) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.LOWER_CAMEL,
				toLowerUnderscore(name));
	}
	
	static String toShoutyUnderscore(String name) {
		return name.toUpperCase().replace(" ", "_");
	}
}
