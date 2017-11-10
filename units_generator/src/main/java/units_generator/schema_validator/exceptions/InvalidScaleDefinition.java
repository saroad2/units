package units_generator.schema_validator.exceptions;

public class InvalidScaleDefinition extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8828234110442594483L;

	public InvalidScaleDefinition(String unitScaleName, String context) {
		super(
			unitScaleName + " scale must match EXACTLY ONE of the followings:\n" +
			"\t * has \"is basic\" to be true\n" +
			"\t * has \"multiplier string\" and \"relative to\"\n" +
			"\t * has \"multiplier number\" and \"relative to\"\n" +
			"\t * has \"ratio\"", context);
	}
}
