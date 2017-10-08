package units_generator.schema_reader.exceptions;

public class InvalidTestSuite extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5687474267761220335L;

	public InvalidTestSuite(String typeName) {
		super(typeName + " should have exactly one test suite. one of the followings accured:\n"
				+"\t * no test suite of this type has been found\n"
				+"\t * 2 or more test suites of this type has been found\n");
	}
}
