package units_generator.java_generator;

import com.google.common.base.CaseFormat;

public class JavaNamesFormatter {

	static String formatClassName(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.UPPER_CAMEL,
				unitName.replace(" ", "_"));
	}
	
	static String formatFunctionName(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.LOWER_CAMEL,
				unitName.replace(" ", "_"));
	}
	
	static String formatPackageName(String unitType) {
		return unitType.toLowerCase().replace(" ", "_");
	};
}
