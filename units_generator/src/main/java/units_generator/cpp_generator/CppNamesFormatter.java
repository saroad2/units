package units_generator.cpp_generator;

import com.google.common.base.CaseFormat;

public class CppNamesFormatter {

	static String formatClassname(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, unitName);
	}
}
