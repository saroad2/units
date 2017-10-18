package units_generator.schema_reader.exceptions;

public class InvalidDenumeratorsInRatio extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6670397703959665902L;

	public InvalidDenumeratorsInRatio(String definedUnit) {
		super("denumerators in " + definedUnit + " must be defined (even if it is empty).");
	}
}
