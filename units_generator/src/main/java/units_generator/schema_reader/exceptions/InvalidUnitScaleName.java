package units_generator.schema_reader.exceptions;

public class InvalidUnitScaleName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 454371205099965796L;

	public InvalidUnitScaleName(int index, String typeName) {
		super(
			"Unit scale number " + index + " of type " + typeName + 
			" must have one of the followings:\n" +
			"\t * \"plural name\" slot with string value that has only letters and spaces\n" +
			"\t * \"name\" slot with string value that has only letters and spaces\n");
	}
}
