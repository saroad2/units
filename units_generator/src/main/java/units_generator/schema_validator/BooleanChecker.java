package units_generator.schema_validator;

import java.util.Arrays;

public class BooleanChecker {
	public static boolean exactlyOne(Boolean... values) {
		if (values.length == 1)
			return values[0];
		Boolean[] others = Arrays.asList(values).subList(1, values.length).toArray(new Boolean[0]);
		return values[0] ? !anyOne(others) : exactlyOne(others);
	}
	
	public static boolean anyOne(Boolean... values) {
		for (int i=0; i < values.length; ++i)
			if (values[i])
				return true;
		return false;
	}
}
