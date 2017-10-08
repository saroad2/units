package units_generator.schema_reader.exceptions;

public class InvalidUnitTypeCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3880236362226475719L;

	public InvalidUnitTypeCount(String typeName, long numberOfTimes) {
		super(
			typeName + " unit type found " + numberOfTimes + " times in schema");
	}
}
