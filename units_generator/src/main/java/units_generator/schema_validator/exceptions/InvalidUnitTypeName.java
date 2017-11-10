package units_generator.schema_validator.exceptions;

public class InvalidUnitTypeName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4931731630466623148L;

	public InvalidUnitTypeName(int index) {
		super("Unit type number " + index + " has no type name");
	}
}
