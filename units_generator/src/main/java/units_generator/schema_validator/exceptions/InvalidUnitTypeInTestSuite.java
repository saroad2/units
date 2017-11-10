package units_generator.schema_validator.exceptions;

public class InvalidUnitTypeInTestSuite extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3491054984064200173L;

	public InvalidUnitTypeInTestSuite(int index, String unitTypeName) {
		super("test suite in index " + index + " has invalid unit type: " + unitTypeName);
	}
}
