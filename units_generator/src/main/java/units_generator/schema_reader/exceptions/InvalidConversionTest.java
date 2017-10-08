package units_generator.schema_reader.exceptions;

public class InvalidConversionTest extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1759214173663595204L;

	public InvalidConversionTest(long testCasesCount, String from, String to) {
		super("there are " + testCasesCount + " test case from " + from + " to " + to +
				". there should be only one");
	}
}
