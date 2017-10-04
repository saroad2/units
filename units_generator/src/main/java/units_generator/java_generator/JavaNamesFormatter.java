package units_generator.java_generator;

import com.google.common.base.CaseFormat;

public class JavaNamesFormatter {

	static String formatClassname(String unitName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, unitName.replace(" ", "_"));
	}
}
