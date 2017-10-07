package units_generator.cpp_generator;

import com.google.common.base.CaseFormat;

public class CppNamesFormatter {

	static String formatClassName(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(
				CaseFormat.UPPER_CAMEL,
				unitName.toLowerCase().replace(" ", "_"));
	}
	
	static String formatUnitTypeHeaderName(String unitType) {
		return unitType.toLowerCase().replace(" ", "_") + "_units.h";
	}
	
	static String formatNamespaceName(String unitType) {
		return unitType.toLowerCase().replace(" ", "_");
	}
}
