package units_generator.schema_reader.exceptions;

public class InvalidDenominatorsInRatio extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6670397703959665902L;

	public InvalidDenominatorsInRatio(String definedUnit) {
		super("denominators in " + definedUnit + " must be defined (even if it is empty).");
	}
}
