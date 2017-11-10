package units_generator.schema_validator.exceptions;

public class InvalidPluralName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4725545374043555878L;

	public InvalidPluralName(int index, String typeName) {
		super("Unit scale number " + index + " of type " + typeName + " has no plural name.");
	}
}
