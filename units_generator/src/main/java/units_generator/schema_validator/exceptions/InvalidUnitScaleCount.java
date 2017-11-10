package units_generator.schema_validator.exceptions;

public class InvalidUnitScaleCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4158463001679678815L;

	public InvalidUnitScaleCount(String unitScaleName, long count) {
		super("\"" + unitScaleName + "\" unit type found " + count
				+ " times in schema, but there should be only one");
	}
}
