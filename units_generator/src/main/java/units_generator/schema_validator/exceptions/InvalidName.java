package units_generator.schema_validator.exceptions;

public class InvalidName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 454371205099965796L;

	public InvalidName(String name) {
		super("\"" + name + "\" is invalid. name must contain only" +
				" lowercase letters and no trailing spaces");
	}
}
