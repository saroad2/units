package units_generator.schema_validator.exceptions;

public class InvalidNumeratorsInRatio extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4181062442279303669L;

	public InvalidNumeratorsInRatio(String definedUnit) {
		super("numerators in " + definedUnit + " must be defined (even if it is empty).");
	}
}
