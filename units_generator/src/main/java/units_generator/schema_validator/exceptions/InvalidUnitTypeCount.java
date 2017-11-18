package units_generator.schema_validator.exceptions;

public class InvalidUnitTypeCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3880236362226475719L;

	public InvalidUnitTypeCount(String unitTypeName, long count, String context) {
		super("\"" + unitTypeName + "\" unit type found " + count
				+ " times in schema, but there should be exactly one", context);
	}
}
