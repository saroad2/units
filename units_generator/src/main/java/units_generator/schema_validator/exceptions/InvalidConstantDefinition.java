package units_generator.schema_validator.exceptions;

public class InvalidConstantDefinition extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7200036100795696471L;

	public InvalidConstantDefinition(String context) {
		super("constant can't have both \"unit scale\" and \"ratio\" attributes", context);
	}
}
