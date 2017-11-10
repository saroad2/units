package units_generator.schema_validator.exceptions;

public class InvalidTestSuiteCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5687474267761220335L;

	public InvalidTestSuiteCount(String unitTypeName, long count) {
		super("\"" + unitTypeName + "\" should have exactly one test suite. found " + count);
	}
}
