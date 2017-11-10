package units_generator.schema_validator.exceptions;

public class InvalidUnitScaleCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4158463001679678815L;

	public InvalidUnitScaleCount(
			String scaleName, String typeName, long numberOfTimes) {
		super(scaleName + " scale of unit type " + typeName + " found "
			+ numberOfTimes + " times in schema");
	}
}
